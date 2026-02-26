package basics;

import java.util.Locale;
import java.util.Scanner;

public class Entradas {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);	// Cria o Scanner "sc" e recebe entrada do teclado(System.in)
		
		System.out.println(" Digite: ");
		String Palavra = sc.next();		// Utiliza o Scanner criado(sc) usando next(primeira palavra somente)
		System.out.printf(" Você digitou: %s\n\n", Palavra);
		sc.nextLine();	 // Limpa caso digite mais de uma palavra no Next
		
		System.out.println(" Digite: ");
		String Frase = sc.nextLine();		// Utiliza o Scanner criado(sc) usando nextLine(Frase inteira)
		System.out.printf(" Você digitou: %s\n\n", Frase);
		
		System.out.println(" Digite: ");
		int Numero = sc.nextInt();		// Utiliza o Scanner criado(sc) usando nextInt(Inteiro)
		System.out.printf(" Você digitou: %d\n\n", Numero);
		sc.nextLine();
		
		System.out.println(" Digite: ");
		Double NumQuebrado = sc.nextDouble();		// Utiliza o Scanner criado(sc) usando nextDouble(Numero Decimal)
		System.out.printf(" Você digitou: %.2f\n\n", NumQuebrado);
		sc.nextLine();
		
		sc.close();		// Fecha o Scan
	

	}

}
