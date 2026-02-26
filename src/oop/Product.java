package oop;

public class Product {
	private String name;	// Classes privadas para só serem alteradas por getters ou setters
	private double value;
	private int quantity;

	public Product(String name, double value, int quantity) { // Constructor com parametros
		this.name = name;
		this.value = value;
		this.quantity = quantity;
	}

	public Product(String name, double value) { // Sobrecarga do construtor para aceitar quantidade 0
		this.name = name;
		this.value = value;
		quantity = 0;
	}

	public String toString() { // Método toString para receber informação APONTADA da classe.
		return "Product [name=" + name 
				+ ", value=" + String.format("%.2f", value) 
				+ ", quantity=" + quantity + "]";
	}

	public Product() {	// Construtor para receber informações vazias

	}

	public void setValue(double value) {	// Função set para mudar o valor(Caso esteja como private)
		this.value = value;
	}

	public double getValue() {	// Função get para ver o valor(Caso esteja como private)
		return value;
	}

	public String getName() { 
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQuantity() {	// Quantidade não pode ser modificado com set, por questão de Regras de negócio.
		return quantity;
	}
	public void addQuantity(int amount) {
    if (amount > 0) {
        quantity += amount;
    }}

	public void removeQuantity(int amount) {
    if (amount > 0 && amount <= quantity) {
        quantity -= amount;
    }}
}
