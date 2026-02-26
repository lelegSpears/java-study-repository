package strings;

public class FuncoesString {

	public static void main(String[] args) {
		String palavra = " ahj ABC UAU ahb ABC  ";
		String palavraToLowerCase = palavra.toLowerCase(); // Converte tudo para minusculo
		String palavraToUpperCase = palavra.toUpperCase(); // Converte tudo para maiusculo
		String palavraTrim = palavra.trim(); // Corta espaços em branco
		String palavraSubstring = palavra.substring(2); // Mostra a partir da posição 2(0, 1, 2)
		String palavraSubstring2 = palavra.substring(2, 9); // Mostra a partir da posição 2 e antes da 9
		String palavraReplace = palavra.replace('a', 'y'); // Substitui a letra por outra
		String palavraReplace2 = palavra.replace("ABC", "xy"); // Substitui uma palavra por outra
		int i = palavra.indexOf("BC"); // Procura a primeira posição
		int j = palavra.lastIndexOf("BC"); // Procura a ultima posição

		String s = "potato aple lemon";
		String[] vect = s.split(" "); // [] Transforma em vetor e s.split determina que " " é o separador

		System.out.println(" Palavra original: " + palavra);
		System.out.println(" PalavraToLowerCase:" + palavraToLowerCase);
		System.out.println(" PalavraToUpperCase: " + palavraToUpperCase);
		System.out.println(" PalavraTrim:" + palavraTrim);
		System.out.println(" PalavraSubstring: " + palavraSubstring);
		System.out.println(" PalavraSubstring2: " + palavraSubstring2);
		System.out.println(" PalavraReplace: " + palavraReplace);
		System.out.println(" PalavraReplace2: " + palavraReplace2);
		System.out.println(" Palavra indexOf: " + i);
		System.out.println(" Palavra lastIndexOf: " + j);

		System.out.printf("\n\n Vect[0]: %s\n", vect[0]); // Mostra a palavra na posição 0(primeira)
		System.out.printf(" Vect[1]: %s\n", vect[1]); // Mostra a palavra na posição 1
		System.out.printf(" Vect[2]: %s\n", vect[2]); // Mostra a palavra na posição 2

	}

}
