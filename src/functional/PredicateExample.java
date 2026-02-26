package functional;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;


public class PredicateExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Produto> lista = new ArrayList<>();
		lista.add(new Produto("PC", 1000.0));
		lista.add(new Produto("Tv", 140.2));
		lista.add(new Produto("AirFryer", 500.5));
		
		double valor = sc.nextInt();
		
		// Remove os produtos com valor menor do que o digitado.
		Predicate<Produto> pred = p -> p.getValor() < valor;
		
		lista.removeIf(pred);
		for(Produto p : lista) {
			System.out.println(p.getName() + ", " + p.getValor());
		}
		sc.close();
	}

}