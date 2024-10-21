package application07;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner edd = new Scanner(System.in);
		System.out.print("QUANTOS NUMEROS VOCE VAI DIGITAR: ");
		int n = edd.nextInt();

		double[] vect = new double[n];

		for (int i = 0; i < vect.length; i++) {
			System.out.print("DIGITE " + (i + 1) + "° UM NUMERO:  ");
			vect[i] = edd.nextDouble();
		}

		double maiorNumero = vect[0];
		int posicaoMaior = 0;

		for (int i = 0; i < vect.length; i++) {
			if (vect[i] > maiorNumero) {

				maiorNumero = vect[i];
				posicaoMaior = i+1;

			}
		}

		System.out.println("O maior número é: " + maiorNumero);
		System.out.println("A posição do maior número é: " + posicaoMaior);
		edd.close();

	}

}
