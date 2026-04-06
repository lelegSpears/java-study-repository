package oop;

import java.util.Scanner;

public class TestePessoa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Pessoa x, y;	// Declara Classe Pessoa x e y
		x = new Pessoa();	// Inicializa a pessoa x
		y = new Pessoa();	// Inicializa a pessoa y
		
		System.out.print(" Digite um nome: ");
		x.nome = sc.nextLine();
		System.out.print(" Digite uma idade: ");
		x.idade = sc.nextInt();
		sc.nextLine();
		System.out.print(" Digite um sexo: ");
		x.sexo = sc.nextLine();
		
		System.out.print(" Digite um nome2: ");
		y.nome = sc.nextLine();
		System.out.print(" Digite uma idade2: ");
		y.idade = sc.nextInt();
		sc.nextLine();
		System.out.print(" Digite um sexo2: ");
		y.sexo = sc.nextLine();
		
		sc.close();
		
		System.out.printf(" Pessoa x = Se chama %s, tem %d anos, %s. Sendo %s.\n", x.nome, x.idade, x.sexo, x.maiorIdade());
		System.out.printf(" Pessoa y = Se chama %s, tem %d anos, %s. Sendo %s.", y.nome, y.idade, y.sexo, y.maiorIdade());
	}
}
