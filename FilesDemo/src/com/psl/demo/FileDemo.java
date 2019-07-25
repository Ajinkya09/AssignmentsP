package com.psl.demo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class FileDemo {
	public static void main(String[] args) {

		File f = new File("Test.txt");

		if (f.exists()) {
			System.out.println("File Exists");
		} else {
			System.out.println("File doesn't exists.. Creating new file...");

			try {
				f.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		System.out.println(f.getName());
		System.out.println(f.getPath());
		System.out.println(f.getAbsolutePath());
		System.out.println(f.canRead());
		System.out.println(f.canWrite());

		String str = "Writing, this, text into, file...404!";

		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream(f);
			fos.write(str.getBytes());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		FileInputStream fis = null;
		try {
			fis = new FileInputStream(f);

			Scanner sc = new Scanner(fis);

			sc.useDelimiter(", ");
			
			while (sc.hasNext()) {
				System.out.println(sc.next());
			}

			// BufferedReader br = new BufferedReader(new
			// InputStreamReader(fis));
			//
			// String str1 = br.readLine();
			// System.out.println(str1);

			// int i = 0;
			// while ((i = fis.read()) != -1) {
			// System.out.print((char) i);
			// }
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}