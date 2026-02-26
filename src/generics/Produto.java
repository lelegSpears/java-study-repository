package generics;

public class Produto implements Comparable<Produto>{
	private String nome;
	private Double valor;
	
	public Produto(String nome, Double valor) {
		this.nome = nome;
		this.valor = valor;
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "Produto [nome=" + nome + ", valor=" + valor + "]";
	}
	
	public int compareTo(Double outro) {
	 return this.valor.compareTo(outro);
	}

	public int compareTo(Produto outro) {
		return valor.compareTo(outro.getValor());
	}

	
	
	
}
