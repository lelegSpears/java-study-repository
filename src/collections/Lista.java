package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lista {

	public static void main(String[] args) {
		List<String> lista = new ArrayList<>(); // Cria lista(de strings), como objeto ArrayList(pega vantagens de vetor)
		
		lista.add("Pantheon"); // Adiciona nome a lista
		lista.add("Khazix");
		lista.add("Stonks");
		lista.add(1,"zac");	// Adiciona nome na posição 1
		lista.add(3,"Scrum"); // Adiciona na posição 3
		lista.add("Store");
		lista.add("Print");
		lista.add("Howl");
		System.out.println(" Lista completa: ");
		for(int i=0;i<lista.size();i++) {	// Exibe a lista com indice
		System.out.println(lista.get(i));
		}
		System.out.println("------------");
		System.out.println(" Indice da palavra Howl: " + lista.indexOf("Howl"));
		System.out.println("------------");
		
		lista.remove("Khazix");	// Remove a palavra digitada
		lista.remove(1); // Remove a palavra na posição
		lista.removeIf(lst -> lst.charAt(0) == 'S');	// Se na lista o caractere na posição 0 for S, remova(Um predicado)
		
		System.out.printf(" Tamanho da lista atualizada: %d\n", lista.size());	// Mostra o tamanho da lista
		System.out.println("Você digitou: ");
		for(String lst : lista) {	// Jeito alternativo de mostrar a lista inteira(Com for-Each)
			System.out.println(lst);
		}
		
		System.out.println("------------");
		
		System.out.println(" Palavras com primeira letra P: ");
		List<String> listaS = lista.stream().filter(lst -> lst.charAt(0) == 'P').collect(Collectors.toList()); // Converte a lista numa Stream(fluxo de dados para usar filtro) e transforma o item filtrado em lista denovo".collect(Collectors.toList())"
		for(String lstS : listaS) {	// Jeito alternativo de mostrar a lista inteira(Com for-Each)
			System.out.println(lstS);
		}
		 				  
		System.out.println("------------");
		
		System.out.println(" Primeira palavra com letra P: ");
		String palavraL = lista.stream().filter(p -> p.charAt(0) == 'P').findFirst().orElse(null); // findFirst para filtrar PRIMEIRO resultado, Se Não, retorna null
		System.out.println(palavraL);
		}
}