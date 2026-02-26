package generics;

import java.util.Scanner;


public class GenericsExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		PrintService<Integer> ps = new PrintService<>();
		int quantidade = sc.nextInt();
		for(int i=0;i<quantidade;i++) {
			System.out.printf("Digite o valor #%d:\n", i+1);
			ps.addValue(sc.nextInt());
			System.out.print("\n");
		}
		ps.print();
		sc.close();
	}

}
