package application02;

import java.util.Locale;
import java.util.Scanner;

import entities01.Product;

public class Program {

	public static void main(String[] args) {
		Scanner edd = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		int n = edd.nextInt();

		Product[] vect = new Product[n];

		for (int i = 0; i < vect.length; i++) {
			edd.nextLine();
			String nome = edd.nextLine();
			double preco = edd.nextDouble();

			vect[i] = new Product(nome, preco);
		}

		double soma = 0.0;

		for (int i = 0; i < vect.length; i++) {
			soma += vect[i].getPreco();
		}

		double media = soma / n;
		System.out.println("VALOR TOTAL: " + soma);
		System.out.printf("MEDIA DOS VALORES: %.2f%n", media);

		edd.close();

	}

}
