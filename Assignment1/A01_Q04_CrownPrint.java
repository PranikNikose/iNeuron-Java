package com.ineuron.assignment1;

public class A01_Q04_CrownPrint {
	
	public static void main(String[] args) {
		
		int n = 13;
		for (int i = 0; i <= n; i++) {
			for (int j = 0; j <= n; j++) {
				if (i==n
						|| i==n-1
						|| i==n-2 && j!=n/2 && j!=n/2+1
						|| i==n-3 && j!=n/2-1 && j!=n/2 && j!=n/2+1 && j!=n/2+2
						|| i==n-4 && j!=n/2-2 && j!=n/2-1 && j!=n/2 && j!=n/2+1 && j!=n/2+2 && j!=n/2+3
						|| i==n-5 && j!=n/2-3 && j!=n/2-2 && j!=n/2-1 && j!=n/2 && j!=n/2+1 && j!=n/2+2 && j!=n/2+3 && j!=n/2+4
						|| i==n-6 && j!=n/2-4 && j!=n/2-3 && j!=n/2-2 && j!=n/2-1 && j!=n/2 && j!=n/2+1 && j!=n/2+2 && j!=n/2+3 && j!=n/2+4 && j!=n/2+5
						|| i==n-7 && j!=n/2-5 && j!=n/2-4 && j!=n/2-3 && j!=n/2-2 && j!=n/2-1 && j!=n/2 && j!=n/2+1 && j!=n/2+2 && j!=n/2+3 && j!=n/2+4 && j!=n/2+5 && j!=n/2+6
						) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
