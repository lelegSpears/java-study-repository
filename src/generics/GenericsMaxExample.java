package generics;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;



public class GenericsMaxExample {

	public static void main(String[] args) {
		String path = "C:\\Users\\leleg\\OneDrive\\Documents\\mpr.txt";
		List<Produto> lista = new ArrayList<>();
		String nome;
		double valor;

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line;
			while ((line = br.readLine()) != null) {
				String[] partes = line.split(", ");
				nome = partes[0];
				valor = Double.parseDouble(partes[1]);

				lista.add(new Produto(nome, valor));
			}
			int i = 1;
			for (Produto p : lista) {
				System.out.printf("%d - %s%n", i, p);
				i++;
			}

			Produto x = CalculationService.max(lista);
			System.out.printf("%n%nProduto com maior valor: %s", x);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
