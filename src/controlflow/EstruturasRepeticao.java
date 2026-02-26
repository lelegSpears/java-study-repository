package controlflow;

import java.util.Locale;
import java.util.Scanner;

public class EstruturasRepeticao {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		// Estrutura while
		System.out.print(" Escolha um numero de 0 a 10: ");
		int x = sc.nextInt();
		while (0 > x || x > 10) {
			System.out.print(" Escolha um numero de 0 a 10: ");
			x = sc.nextInt();
			sc.nextLine();
		}
		System.out.printf(" Você escolheu %d.\n\n", x);
		
		// Estrutura "for" com indice
		System.out.print(" Quantos numeros voce quer somar?: ");
		int escolha = sc.nextInt();	// Escolher quantos numeros
		sc.nextLine();
		int nf = 0;
		int pedido = escolha;
		for (int i=0; i<escolha; i++) {	// Inicio; Condição; Incremento;
			int faltam = escolha - i;	// Para saber quantos números faltam;
			System.out.printf(" Digite mais %d números: ", faltam);
			int escolha2 = sc.nextInt();	// Escolher os números para soma
			sc.nextLine();
			nf += escolha2;	// Resultado final da soma
		}
		System.out.printf("Você decidiu somar %d números, que somados resultaram em %d.\n\n", pedido, nf);
		
		// Estrutura "do-while"
		int opcao;
		do {
		System.out.println(" Menu Simples \n 1 - Continuar\n 2 - Sair");
		opcao = sc.nextInt();
		sc.nextLine();
		
		switch (opcao) {
		case 1:
			System.out.println("Você escolheu continuar.");
			break;
		case 2:
			System.out.println(" Encerrando...");
			break;
		default:
			System.out.println(" Digite um valor inválido.");
			break;
		}}
	while (opcao != 2);

	sc.close();

	}

}
