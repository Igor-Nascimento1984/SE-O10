package appkication19;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner edd = new Scanner(System.in);
		System.out.print("LINHAS: ");
		int n = edd.nextInt();
		System.out.print("COLUNAS: ");
		int m = edd.nextInt();
		int[][] mat = new int[n][m];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				mat[i][j] = edd.nextInt();
			}
		}

		int count = 0;
		System.out.println();

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (mat[i][j] < 0) {
					count++;
				}
			}
		}
		System.out.print("ESCOLHA O NÚMERO:");
		int x = edd.nextInt();

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (mat[i][j] == x) {
					System.out.println("Position " + i + "," + j + ":");
					if (j > 0) {
						System.out.println("Left: " + mat[i][j - 1]);
					}
					if (i > 0) {
						System.out.println("Up: " + mat[i - 1][j]);
					}
					if (j < mat[i].length - 1) {
						System.out.println("Right: " + mat[i][j + 1]);
					}
					if (i < mat.length - 1) {
						System.out.println("Down: " + mat[i + 1][j]);
					}
				}
			}
		}

		System.out.println("NÚMEROS NEGATIVOS = " + count);
		edd.close();

	}

}
