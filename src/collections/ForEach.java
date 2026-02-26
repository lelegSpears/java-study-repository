package collections;

public class ForEach {

	public static void main(String[] args) {
		String[] vetor = new String[] { "Lukaskas", "Enzo", "Lucko" };

		for (String Apelido : vetor) { // Percorre todo o vetor dando o apelido "Apelido".
			System.out.println(Apelido);
		}
	}
}