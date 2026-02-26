package generics;

import java.util.Arrays;
import java.util.List;

public class TipoCoringaExample {

	public static void main(String[] args) {
		List<Integer> listaI = Arrays.asList(1, 3, 4);
		printList(listaI);
		List<String> listaL = Arrays.asList("paralelepipedo", "pindamonhangaba", "entendi");
		printList(listaL);
	}

	public static void printList(List<?> lista) {
		for(Object obj : lista){
			System.out.println(obj);
		}
	}
}
