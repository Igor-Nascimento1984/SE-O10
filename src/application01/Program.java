package application01;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner edd = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		int n = edd.nextInt();

		double[] vect = new double[n];

		for (int i = 0; i < n; i++) {
			vect[i] = edd.nextDouble();
		}

		double soma = 0.0;
		for (int i = 0; i < n; i++) {
			soma += vect[i];
		}

		double media = soma / n;
		System.out.println("VALOR TOTAL: " + soma);
		System.out.printf("MEDIA DOS VALORES: %.2f%n", media);

		edd.close();

	}

}
