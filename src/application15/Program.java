package application15;

import java.util.Scanner;

import entities15.Rent;

public class Program {

	public static void main(String[] args) {

		Scanner edd = new Scanner(System.in);

		Rent[] vect = new Rent[10];
		System.out.print("QUANTOS QUARTOS SERÃO ALUGADOS?");
		int n = edd.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println();
			System.out.println("ALUGUEL #" + i);
			System.out.print("NOME: ");
			edd.nextLine();
			String nome = edd.nextLine();
			System.out.print("EMAIL: ");
			String email = edd.nextLine();
			System.out.print("QUARTO: ");
			int quarto = edd.nextInt();

			vect[quarto] = new Rent(nome, email);

		}
		System.out.println();
		System.out.println("QUARTOS ALUGADOS");
		for (int i = 0; i < 10; i++) {
			if(vect[i] != null) {
			System.out.println("QUARTO: "+i+" - "+vect[i].toString());
			}
		}
		edd.close();
	}

}
