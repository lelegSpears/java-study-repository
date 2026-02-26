package arrays;

import java.util.Scanner;

public class Matrizes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int negativos = 0;
		int[][] mat = new int[n][n]; // Dois [] significam 2 dimensões, uma matriz do tamanho "n"

		for (int i = 0; i < mat.length; i++) { // Cria uma lista para baixo do tamanho da matriz
			System.out.printf(" Preencha a coluna %d: \n", i);
			for (int j = 0; j < mat[i].length; j++) { // Cria uma lista para direita
				mat[i][j] = sc.nextInt(); // Preenche a matriz com as posições i e J
			}
		}
		System.out.print(" Diagonal Principal: ");
		for (int i = 0; i < mat.length; i++) {
			System.out.print(mat[i][i] + " "); // Mostra a posição onde i e j são iguais(Diagonal)
		}
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat.length; j++) {
				if (mat[i][j] < 0) { // Percorre a matriz e verifica se o numero é negativo
					negativos++; // Adiciona no contador
				}
			}
		}
		System.out.printf("\n Quantos negativos: " + negativos);

		System.out.println("\n Quantas colunas tem: " + mat.length);

		// Imprime a matriz
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
		sc.close();

	}

}
