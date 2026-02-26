package arrays;

import java.util.Scanner;

import oop.Product;

public class Vetores {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print(" Quantas palavras você quer guardar? ");
		int n = sc.nextInt(); // Quantas palavras
		sc.nextLine();
		String[] vetorPalavras = new String[n]; // Criando vetor com numero N de palavras

		for (int i = 0; i < n; i++) { // Cria palavras até n
			System.out.printf(" Digite a %d° palavra: ", i + 1);
			vetorPalavras[i] = sc.next(); // Quais palavras
		}
		System.out.printf("Você escolheu guardar %d Palavras, as palavras foram %s.\n\n", n,
				String.join(", ", vetorPalavras));

		System.out.print(" Quantos produtos você quer criar: ");
		int x = sc.nextInt(); // Numero de produtos
		sc.nextLine();
		Product[] vetorProdutos = new Product[x];

		for (int i = 0; i < x; i++) { // Criar produtos até x
			System.out.printf(" -%d° Produto-\n", i + 1);
			System.out.print(" Nome do produto: ");
			String name = sc.nextLine(); // adicionar nome

			System.out.print(" Valor do produto: ");
			Double value = sc.nextDouble(); // adicionar valor
			sc.nextLine();

			System.out.print(" Quantidade do produto: ");
			int quantity = sc.nextInt(); // adicionar quantidade
			sc.nextLine();

			vetorProdutos[i] = new Product(name, value, quantity); // Criar produto

			System.out.printf("Você criou o %d° produto com as informações %s.\n", i + 1, vetorProdutos[i]); // Mostrar
																												// na
																												// repetição
																												// o
																												// resultado
		}
		sc.close();
	}
}
/*
 * 
 * package entities;
 * 
 * public class Product { // Produto private String name; // Classes privadas
 * para só serem alteradas por getters ou setters private double value; private
 * int quantity;
 * 
 * public Product(String name, double value, int quantity) { // Constructor com
 * parametros this.name = name; this.value = value; this.quantity = quantity; }
 * 
 * public Product(String name, double value) { // Sobrecarga do construtor para
 * aceitar quantidade 0 this.name = name; this.value = value; quantity = 0; }
 * 
 * @Override public String toString() { // Método toString para receber
 * informação APONTADA da classe. return "Product nome = " + name + ", valor = "
 * + String.format("%.2f", value) + ", quantidade = " + quantity; }
 * 
 * public Product() { // Construtor para receber informações vazias
 * 
 * }
 * 
 * public void setValue(double value) { // Função set para mudar o valor(Caso
 * esteja como private) this.value = value; }
 * 
 * public double getValue() { // Função get para ver o valor(Caso esteja como
 * private) return value; }
 * 
 * public String getName() { return name; }
 * 
 * public void setName(String name) { this.name = name; }
 * 
 * public int getQuantity() { // Quantidade não pode ser modificado com set, por
 * questão de Regras de negócio. return quantity; } }
 */
