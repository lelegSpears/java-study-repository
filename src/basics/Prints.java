package basics;

import java.util.Locale;

public class Prints {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		String nome = "jao";
		byte idade = 50;
		double salario = 5.300;
		
		
		System.out.printf("%s tem %d anos e recebe %.2f de salario.\n", nome, idade, salario);
		
		System.out.println(nome + " tem " + idade + " anos e recebe " + String.format("%.2f", salario) + " de salario.");
	

	}

}
