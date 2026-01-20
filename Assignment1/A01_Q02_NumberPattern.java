package com.ineuron.assignment1;

public class A01_Q02_NumberPattern {

	public static void main(String[] args) {

		int start = 1;
		int end = 4;
		for (int i = start; i <= end; i++) {
			for (int j = start; j <= end; j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}
}
