package functional;

import java.util.Objects;

public class Produto implements Comparable<Produto> {
	private String name;
	private Double valor;
	
	public Produto() {
		
	}
	
	public Produto(String name, Double valor) {
		this.name = name;
		this.valor = valor;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "Produto [name=" + name + ", valor=" + valor + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, valor);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		return Objects.equals(name, other.name) && Objects.equals(valor, other.valor);
	}

	@Override
	public int compareTo(Produto Outro) {
		return this.name.toUpperCase().compareTo(Outro.name.toUpperCase());
	}
	
	
}
