package com.psl.files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Program2 {
	public static void main(String[] args) {
		File f = new File("io.txt");
		Scanner sc = new Scanner(System.in);

		if (f.exists()) {
			System.out.println("Source File Exists");
		} else {
			System.out
					.println("Source File doesn't exists.. Creating new file...");

			try {
				f.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		System.out.println("Enter data into file : ");
		String inStr = sc.nextLine();
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream(f);
			fos.write(inStr.getBytes());

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

		System.out.println("Reading from file :");
		long length = f.length();
		System.out.println("Length of file is : "+ length);
		FileInputStream fis = null;

		try {
			fis = new FileInputStream(f);

			BufferedReader br = new BufferedReader(new InputStreamReader(fis));

			String str1 = br.readLine();
			System.out.println(str1);
			br.close();
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
		sc.close();
	}
}
