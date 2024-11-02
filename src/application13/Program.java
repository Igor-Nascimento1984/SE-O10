package application13;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		/*
		 * Resposta via chatGPT.
		 */
		
		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite o número de pessoas: ");
		int N = scanner.nextInt();

		double[] alturas = new double[N];
		char[] generos = new char[N];

		for (int i = 0; i < N; i++) {
			System.out.print("Digite a altura da pessoa " + (i + 1) + ": ");
			alturas[i] = scanner.nextDouble();
			System.out.print("Digite o gênero da pessoa " + (i + 1) + " (M/F): ");
			generos[i] = scanner.next().toUpperCase().charAt(0);
		}

		// Inicializando variáveis
		double maiorAltura = alturas[0];
		double menorAltura = alturas[0];
		double somaAlturasMulheres = 0;
		int contMulheres = 0;
		int contHomens = 0;

		// Processando os dados
		for (int i = 0; i < N; i++) {
			// Verificando maior e menor altura
			if (alturas[i] > maiorAltura) {
				maiorAltura = alturas[i];
			}
			if (alturas[i] < menorAltura) {
				menorAltura = alturas[i];
			}

			// Calculando média de altura das mulheres e contando homens
			if (generos[i] == 'F') {
				somaAlturasMulheres += alturas[i];
				contMulheres++;
			} else if (generos[i] == 'M') {
				contHomens++;
			}
		}

		// Calculando a média de altura das mulheres
		double mediaAlturaMulheres = (contMulheres > 0) ? (somaAlturasMulheres / contMulheres) : 0;

		// Exibindo os resultados
		System.out.println("Maior altura: " + maiorAltura);
		System.out.println("Menor altura: " + menorAltura);
		System.out.printf("Média de altura das mulheres: %.2f%n", mediaAlturaMulheres);
		System.out.println("Número de homens: " + contHomens);

		scanner.close();
	}
}
