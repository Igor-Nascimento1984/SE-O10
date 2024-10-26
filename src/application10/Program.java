package application10;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner edd = new Scanner(System.in);
		System.out.print("QUANTOS NUMEROS VOCE VAI DIGITAR: ");
		int n = edd.nextInt();

		int[] vect = new int[n];

		int soma = 0;
		int divisor = 0;

		for (int i = 0; i < vect.length; i++) {
			System.out.print("DIGITE UM NUMERO:  ");
			vect[i] = edd.nextInt();
			if (vect[i] % 2 == 0) {
				soma += vect[i];
				divisor += 1;

			}
		}

		if (divisor > 0) {
			int media = soma / divisor;

			System.out.println(soma);
			System.out.println(divisor);

			System.out.println("MEDIA NUMEROS PARES: ");
			System.out.println(media);
		} else {
			System.out.println("NÃO TEM NUMERO PARES");
		}

		edd.close();

	}
}
