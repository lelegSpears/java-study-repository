package oop;

import java.util.Scanner;

public class ClasseBasica {

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
	/* O PACOTE ENTITIES:
	package entities;

	public class Pessoa {	// Classe pessoa com nome, idade e sexo
		public String nome;
		public int idade;
		public String sexo;

	public String maiorIdade() {	// Função para saber se é maior de idade
		String Resp;
		if (idade >= 18) {
			Resp = "Maior de idade";
		}
		else {
			Resp = "Menor de idade";
		}
		return Resp;	// Retorna a resposta
	}
		
	} */