package functional;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class FunctionExample {

	public static void main(String[] args) {
		List<Produto> lista = new ArrayList<>();
		lista.add(new Produto("PC", 1000.0));
		lista.add(new Produto("Tv", 140.2));
		lista.add(new Produto("AirFryer", 500.5));
		
		// Transforma em Stream e aplica map em todos os itens da lista, devolvendo todos os nomes em maiúsculo.
		List<String> nomesMaiusculos = lista.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList());
		nomesMaiusculos.forEach(System.out::println);// Chamando o Método println;
		// Stream tem interface funcional Consumer que consome a stream.
	}

}