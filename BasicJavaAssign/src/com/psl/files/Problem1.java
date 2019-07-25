package com.psl.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Problem1 {
	public static void main(String[] args) {
		File fs = new File("Source.txt");
		File fd = new File("Destination.txt");
		Scanner sc = new Scanner(System.in);
		if (fs.exists()) {
			System.out.println("Source File Exists");
		} else {
			System.out
					.println("Source File doesn't exists.. Creating new file...");

			try {
				fs.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		if (fd.exists()) {
			System.out.println("Destination File Exists");
		} else {
			System.out
					.println("Destination File doesn't exists.. Creating new file...");

			try {
				fd.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		FileReader frs = null;
		FileWriter fwd = null;

		try {
			frs = new FileReader(fs);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			System.out.println("Do you want to overwrite (yes/no) :");
			String choice = sc.next();
			if (choice.equals("no")) {
				fwd = new FileWriter(fd, true);
				int data;
				while ((data = frs.read()) != -1) {
					System.out.print((char) data);

					fwd.write(data);
				}
				System.out.println("\nData copied and appended successfully");
			} else {
				fwd = new FileWriter(fd);
				int data;
				while ((data = frs.read()) != -1) {
					System.out.print((char) data);

					fwd.write(data);
				}
				System.out
						.println("\nData copied and overwritten successfully");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fwd.close();
				frs.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}