package basics;

import java.util.Locale;
import java.util.Scanner;

public class BitWise {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print(" Escolha um numero para testar o sexto bit: ");
		int n = sc.nextInt();	// Escolha um numero
		int mask = 0b100000;	// Mascara para testar
		
		if ((mask & n) != 0) {	// Se nenhum for verdadeiro o sexto bit é falso
			System.out.print(" O sexto bit é Verdadeiro.");
		}
		else {
			System.out.print(" O sexto bit é Falso.");
		}
		sc.close();


	}

}
