package com.ineuron.assignment1;

public class A01_Q05_NewPattern {

	public static void main(String[] args) {

		int n = 14;
		for (int i = 0; i <= n; i++) {
			for (int j = 0; j <= n; j++) {
				if (i == 0 
						|| i == n 
						|| j == 0
						|| j==1 && i!=n/2
						|| j==2 && i!=n/2+1 && i!=n/2 && i!=n/2-1
						|| j==3 && i!=n/2+2 && i!=n/2+1 && i!=n/2 && i!=n/2-1 && i!=n/2-2
						|| j==4 && i!=n/2+3 && i!=n/2+2 && i!=n/2+1 && i!=n/2 && i!=n/2-1 && i!=n/2-2 && i!=n/2-3
						|| j==5 && i!=n/2+4 && i!=n/2+3 && i!=n/2+2 && i!=n/2+1 && i!=n/2 && i!=n/2-1 && i!=n/2-2 && i!=n/2-3 && i!=n/2-4
						|| j==6 && i!=n/2+5 && i!=n/2+4 && i!=n/2+3 && i!=n/2+2 && i!=n/2+1 && i!=n/2 && i!=n/2-1 && i!=n/2-2 && i!=n/2-3 && i!=n/2-4 && i!=n/2-5
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
