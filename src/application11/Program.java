package application11;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner edd = new Scanner(System.in);
		System.out.print("QUANTOS PESSOAS VOCE VAI DIGITAR: ");
		int n = edd.nextInt();

		String[] nome = new String[n];
		int[] idade = new int[n];

		for (int i = 0; i < nome.length; i++) {
			System.out.println("DADOS DA " + (i + 1) + "ª PESSOA");
			edd.nextLine();
			System.out.print("NOME: ");
			nome[i] = edd.nextLine();

			System.out.print("IDADE: ");
			idade[i] = edd.nextInt();
		}

		int maisVelha = 0;

		for (int i = 0; i < nome.length; i++) {
			if (idade[i] > idade[maisVelha]) {
				maisVelha = i;
			}
		}

		System.out.println("A pessoa mais velha é: " + nome[maisVelha] + " com " + idade[maisVelha] + " anos.");

		edd.close();

	}

}
