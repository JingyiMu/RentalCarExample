package com.sis.assignment.rentalcar.util;

import java.util.Random;

public class KeyGen {

	public static void main(String[] args) {
		
		System.out.println(generateVin());
	}
	
	private static String generateVin() {
		char[] charr = new char[26+10];
		for(int i=0;i<10;i++) {
			charr[i] =(char) ('0'+i);
		}
		for(int i=10;i<26+10;i++) {
			charr[i] =(char) ('A'+i-10);
		}
		StringBuilder sb = new StringBuilder();
		Random randomGenerator = new Random();
		for(int i=0;i<19;i++) {
			sb.append(charr[randomGenerator.nextInt(36)]);
		}
		return sb.toString();
	}
}
