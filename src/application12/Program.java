package application12;

import java.util.Scanner;

import entities12.People;

public class Program {

	public static void main(String[] args) {

		Scanner edd = new Scanner(System.in);
		System.out.print("QUANTOS ALUNOS VOCE VAI DIGITAR: ");
		int n = edd.nextInt();

		People[] pessoa = new People[n];

		for (int i = 0; i < pessoa.length; i++) {
			System.out.println("DIGITE NOME, PRIMEIRA E SEGUNDA NOTA DO " + (i + 1) + "o ALUNO:");
			edd.nextLine();
			String nome = edd.nextLine();

			double nota01 = edd.nextDouble();
			double nota02 = edd.nextDouble();

			pessoa[i] = new People(nome, nota01, nota02);

		}
		System.out.println("ALINOS APROVADOS:");
		for (int i = 0; i < n; i++) {
			double media = (pessoa[i].getNota01() + pessoa[i].getNota02()) / 2;
			if (media >= 6.0) {
				System.out.println(pessoa[i].getNome());
			}
		}

		edd.close();
	}

}
