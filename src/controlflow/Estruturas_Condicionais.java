package controlflow;

import java.util.Locale;
import java.util.Scanner;

public class Estruturas_Condicionais {

	public static void main(String[] args) {
		 // Define padrão numérico (usa ponto em vez de vírgula)
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite sua nota da prova: ");
        double notaProva = sc.nextDouble();

        System.out.print("Digite sua nota da redação: ");
        double notaRedacao = sc.nextDouble();

        // Uso de && : ambas as condições precisam ser verdadeiras
        if (notaProva > 670.7 && notaRedacao > 0) {
            System.out.println("Você foi aceito.");
        } else {
            System.out.println("Você foi reprovado.");
        }

        double notaFinal = (notaProva + notaRedacao) / 2;
        System.out.printf("Sua média foi %.2f%n%n", notaFinal);

        System.out.print("Digite a forma de pagamento (debito ou credito): ");
        String formaPagamento = sc.next();

        // Uso de || : apenas uma condição precisa ser verdadeira
        if (formaPagamento.equalsIgnoreCase("debito")
                || formaPagamento.equalsIgnoreCase("credito")) {
            System.out.println("Pagamento recebido.");
        } else {
            System.out.println("Pagamento recusado.");
        }

        System.out.print("Escolha um dia de 1 a 7: ");
        int escolha = sc.nextInt();

        String dia;
        switch (escolha) {
            case 1: dia = "domingo"; break;
            case 2: dia = "segunda"; break;
            case 3: dia = "terça"; break;
            case 4: dia = "quarta"; break;
            case 5: dia = "quinta"; break;
            case 6: dia = "sexta"; break;
            case 7: dia = "sábado"; break;
            default: dia = "valor inválido";
        }

        System.out.printf("Você escolheu %s.%n", dia);

        // Ternária: forma curta de if/else simples
        @SuppressWarnings("unused")
		String resultado = (2 > 4) ? "Verdadeiro" : "Falso"; // Verdadeiro esta amarelo pois resultado sempre será falso
        System.out.println("Resultado da ternária: " + resultado);

        sc.close();
	
	}

}
