package oop;

public class Pessoa { // Public apenas para aprendizado
	public String nome;
	public int idade;
	public String sexo;

	public static final String BR = "Portugues";

	public String maiorIdade() { // Função para saber se é maior de idade
		String Resp;
		if (idade >= 18) {
			Resp = "Maior de idade";
		} else {
			Resp = "Menor de idade";
		}
		return Resp; // Retorna a resposta
	}
}