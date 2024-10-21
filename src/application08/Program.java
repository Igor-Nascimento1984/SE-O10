package application08;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner edd = new Scanner(System.in);
		System.out.print("QUANTOS NUMEROS VOCE VAI DIGITAR: ");
		int n = edd.nextInt();

		double[] vectA = new double[n];
		double[] vectB = new double[n];

		System.out.println("DIGITE OS VALORES DE VETOR A:");

		for (int i = 0; i < vectA.length; i++) {

			vectA[i] = edd.nextDouble();
		}
		System.out.println("DIGITE OS VALORES DE VETOR B:");

		for (int j = 0; j < vectB.length; j++) {

			vectB[j] = edd.nextDouble();
		}

		for (int m = 0; m < n; m++) {

			double soma = vectA[m] + vectB[m];
			System.out.println(soma);
		}

		edd.close();

	}

}
