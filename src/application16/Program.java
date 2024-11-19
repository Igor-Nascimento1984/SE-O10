package application16;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();

		list.add("BOB");
		list.add("ALICE");
		list.add("ANA");
		list.add("IGOR");
		list.add("MORGANA");
		list.add(2, "DORINHA");

		System.out.println(list.size());

		for (String x : list) {
			System.out.println("NOME: " + x);
		}

		System.out.println("-----------------------------------------");
		list.remove("BOB");
		list.remove(1);
		list.removeIf(x -> x.charAt(0) == 'M');

		for (String x : list) {
			System.out.println("NOME: " + x);
		}

		System.out.println("-----------------------------------------");

		System.out.println("INDEX OF ALICE: " + list.indexOf("ALICE"));
		System.out.println("INDEX OF DORINHA: " + list.indexOf("DORINHA"));

		System.out.println("-----------------------------------------");

		
		List<String> resultado = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		
		for (String x : resultado) {
			System.out.println("NOME: " + x);
		}
		
		System.out.println("-----------------------------------------");
		
		//String nome = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		String nome = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
		
		System.out.println(nome);
	}

}
