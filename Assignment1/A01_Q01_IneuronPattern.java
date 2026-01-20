package com.ineuron.assignment1;

public class A01_Q01_IneuronPattern {

	public static void main(String[] args) {

		int n = 4;

		// I
		for (int i = 0; i <= n; i++) {
			for (int j = 0; j <= n; j++) {
				if (i == 0 || i == n || j == n / 2) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println();

		// N
		for (int i = 0; i <= n; i++) {
			for (int j = 0; j <= n; j++) {
				if (j == 0 || j == n || i == j) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println();

		// E
		for (int i = 0; i <= n; i++) {
			for (int j = 0; j <= n; j++) {
				if (j == 0 || i == 0 || i == n || (i == n / 2 && j <= n / 2)) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println();

		// U
		for (int i = 0; i <= n; i++) {
			for (int j = 0; j <= n; j++) {
				if ((j == 0 && i != n) || (j == n && i != n) || (i == n && j != 0 && j != n)) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println();

		// R
		for (int i = 0; i <= n; i++) {
			for (int j = 0; j <= n; j++) {
				if (j == 0 || (i == 0 && j != n) || (i == 1 && j == n) || (i == n / 2 && j != n)
						|| (i == n / 2 + 1 && j == 1) || (i == n / 2 + 2 && j == 2) || (i == n / 2 + 3 && j == 3)) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println();

		// O
		for (int i = 0; i <= n; i++) {
			for (int j = 0; j <= n; j++) {
				if ((i == 0 && j != 0 & j != n) || (j == n && i != 0 && i != n) || (i == n && j != 0 && j != n)
						|| (j == 0 && i != 0 && i != n)) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println();

		// N
		for (int i = 0; i <= n; i++) {
			for (int j = 0; j <= n; j++) {
				if (j == 0 || j == n || i == j) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println();
	}
}
