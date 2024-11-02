package application06;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner edd = new Scanner(System.in);
		System.out.print("QUANTOS NUMEROS VOCE VAI DIGITAR: ");
		int n = edd.nextInt();

		int[] vect = new int[n];

		for (int i = 0; i < vect.length; i++) {
			System.out.print("DIGITE UM NUMERO:  ");
			vect[i] = edd.nextInt();
		}
		System.out.println("NUMEROS PARES: ");
		for (int i = 0; i < vect.length; i++) {
			if (vect[i] % 2 == 0) {
				System.out.println(vect[i]);
			}
		}

		edd.close();

	}

}
