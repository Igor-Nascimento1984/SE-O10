package application14;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner edd = new Scanner(System.in);

		System.out.print("QUANTOS QUARTOS SERÃO ALUGADOS?");
		int n = edd.nextInt();

		int[] quarto = new int[n];
		String[] nome = new String[n];
		String[] email = new String[n];

		for (int i = 0; i < n; i++) {

			System.out.println("ALUGUEL #" + (i + 1));
			System.out.print("NOME: ");
			edd.nextLine();
			nome[i] = edd.nextLine();

			System.out.print("EMAIL: ");
			email[i] = edd.nextLine();
			System.out.print("QUARTO: ");
			quarto[i] = edd.nextInt();

		}

		System.out.println("SALAS ALUGADAS:");

		for (int i = 0; i < n; i++) {

			System.out.println(quarto[i] + " - " + nome[i] + " - " + email[i]);
		}

		edd.close();

	}

}
