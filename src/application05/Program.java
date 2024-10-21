package application05;

import java.util.Locale;
import java.util.Scanner;

import entities05.People;

public class Program {

	public static void main(String[] args) {
		Scanner edd = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		int n = edd.nextInt();

		People[] vect = new People[n];

		for (int i = 0; i < n; i++) {
			edd.nextLine();
			String nome = edd.nextLine();
			int idade = edd.nextInt();
			double altura = edd.nextDouble();

			vect[i] = new People(nome, idade, altura);
		}

		double soma = 0.0;
		for (int i = 0; i < n; i++) {
			soma += vect[i].getAltura();
		}

		double mediaAltura = soma / n;

		int menorDeIdade = 0;

		for (int i = 0; i < n; i++) {
			if (vect[i].getIdade() < 18) {
				menorDeIdade++;
			}
		}

		System.out.println();

		double mediamenorDeIdade = (menorDeIdade * 100) / n;

		System.out.println();
		System.out.printf("MEDIA DOS VALORES: %.2f%n", mediaAltura);
		System.out.println("PESSOAS COM MENOS DE 18 ANOS: " + mediamenorDeIdade);

		for (int i = 0; i < n; i++) {
			if (vect[i].getIdade() < 18) {
				System.out.println(vect[i].getNome());
			}
		}

		edd.close();

	}

}
