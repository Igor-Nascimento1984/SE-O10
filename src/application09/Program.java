package application09;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner edd = new Scanner(System.in);
		System.out.print("QUANTOS NUMEROS VOCE VAI DIGITAR: ");
		int n = edd.nextInt();

		double[] vect = new double[n];
		double soma = 0;
		for (int i = 0; i < vect.length; i++) {
			System.out.print("DIGITE " + (i + 1) + "° UM NUMERO:  ");
			vect[i] = edd.nextDouble();

			soma += vect[i];
		}

		double media = soma / n;

		System.out.print("VALORES = ");
		for (int i = 0; i < n; i++) {
			System.out.print(" " + vect[i]);
		}
		System.out.println();
		System.out.println("VALOR TOTAL: " + soma);
		System.out.printf("MEDIA DOS VALORES: %.2f%n", media);
		System.out.println("ABAIXO DA MEDIA:");

		for (int i = 0; i < n; i++) {
			if (media > vect[i]) {
				System.out.println(vect[i]);
			}
		}

		edd.close();
	}

}
