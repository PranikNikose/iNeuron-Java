package com.ineuron.assignment1;

public class A01_Q03_HomeOfStar {

	public static void main(String[] args) {

		int n = 13;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if(i==n-1 
					|| j==0 
					|| j==n-1
					|| i == 0
					|| (i==1 && j!=n/2)
					|| (i==2 && j!=n/2+1 && j!=n/2 && j!=n/2-1)
					|| (i==3 && j!=n/2+2 && j!=n/2+1 && j!=n/2 && j!=n/2-1 && j!=n/2-2)
					|| (i==4 && j!=n/2+3 && j!=n/2+2 && j!=n/2+1 && j!=n/2 && j!=n/2-1 && j!=n/2-2 && j!=n/2-3)
					|| (i==5 && j!=n/2+4 && j!=n/2+3 && j!=n/2+2 && j!=n/2+1 && j!=n/2 && j!=n/2-1 && j!=n/2-2 && j!=n/2-3 && j!=n/2-4)
					|| (i==6 && j!=n/2+5 && j!=n/2+4 && j!=n/2+3 && j!=n/2+2 && j!=n/2+1 && j!=n/2 && j!=n/2-1 && j!=n/2-2 && j!=n/2-3 && j!=n/2-4 && j!=n/2-5)
					|| (i==7 && j==0))
				{
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
