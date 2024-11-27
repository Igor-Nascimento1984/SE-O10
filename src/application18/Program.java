package application18;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner edd = new Scanner(System.in);

		int n = edd.nextInt();

		int[][] mat = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				mat[i][j] = edd.nextInt();
			}
		}

		for (int i = 0; i < n; i++) {
			System.out.print(mat[i][i] + " ");
		}

		int count = 0;
		System.out.println();

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (mat[i][j] < 0) {
					count++;
				}
			}
		}

		System.out.println("NÚMEROS NEGATIVOS = " + count);
		edd.close();

	}

}
