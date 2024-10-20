package application03;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner edd = new Scanner(System.in);
		System.out.print("QUANTIDADES DE NUMEROS:");
		int n = edd.nextInt();
		
		int[] vect = new int[n];
		
		for (int i = 0;i<vect.length;i++) {
			System.out.print("NUMEROS: ");
			vect[i] = edd.nextInt();
		}
		System.out.println("NUMEROS NEGATIVOS: ");
		for (int i = 0;i<vect.length;i++) {
			if(vect[i]<0) {
			System.out.println(vect[i]);}
		}
				
				
		edd.close();
	}

}
