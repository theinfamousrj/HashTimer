package com.rjh.hashtimer;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Raymond John Hill
 * 
 */
public class Main {

	public static void main(String[] args) {
		HashDigest hd = new HashDigest();
		
		//I'm leaving out a lot of the files for the sake of small downloads.		
		ArrayList<File> fileList = new ArrayList<File>();
		fileList.add(new File("Test Files/1000bytes.txt"));
		fileList.add(new File("Test Files/10000bytes.txt"));
//		fileList.add(new File("Test Files/100000bytes.txt"));
//		fileList.add(new File("Test Files/1000000bytes.txt"));
//		fileList.add(new File("Test Files/2500000bytes.txt"));
//		fileList.add(new File("Test Files/5000000bytes.txt"));
//		fileList.add(new File("Test Files/10000000bytes.txt"));
//		fileList.add(new File("Test Files/25000000bytes.txt"));
//		fileList.add(new File("Test Files/50000000bytes.txt"));
//		fileList.add(new File("Test Files/100000000bytes.txt"));
//		fileList.add(new File("Test Files/500000000bytes.txt"));
//		fileList.add(new File("Test Files/1000000000bytes.txt"));
		
		ArrayList<String> algorithmList = new ArrayList<String>();
		algorithmList.add("MD5");
		algorithmList.add("SHA-1");
		algorithmList.add("SHA-256");
		algorithmList.add("SHA-384");
		algorithmList.add("SHA-512");
		
		for(int i=0; i<fileList.size(); i++) {
			for(int j=0; j<10; j++) {
				hd.getDigestOfFile(fileList.get(i), algorithmList.get(4));
				System.out.println(hd.getExecutionTime());
			}
		}
		
	}

}
