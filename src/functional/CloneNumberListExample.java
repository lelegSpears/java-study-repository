package functional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CloneNumberListExample {

	public static void main(String[] args) {
		List<Integer> listaI = Arrays.asList(1, 5, 3);
		List<String> listaS = Arrays.asList("Aprendendo", "Utilizando", "Prática");
		// Contravariância aceita superclasse, e permite apenas Set.
		List<? super Object> listaNova = new ArrayList<>();
		Copy(listaI, listaNova);
		Copy(listaS, listaNova);

		for (Object o : listaNova) {
			System.out.print(o + " ");
		}

	}
	// Método de copiar lista, Covariância aceita subclasse e permite apenas Get.
	public static void Copy(List<? extends Object> listaOriginal, List<Object> listaDestino) {
		for (Object o : listaOriginal) {
			listaDestino.add(o);
		}
	}
}
