package functional;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;


public class ComparatorExample {

	public static void main(String[] args) {
		List<Produto> Lista = Arrays.asList(new Produto("PC", 1000.0),new Produto("Tv", 200.3),new Produto("Janela", 500.2));
		Comparator<Produto> myComparator = null;
		
		Scanner sc = new Scanner(System.in);
		while(myComparator == null) {
		String e = sc.next();
		sc.nextLine();
		
		switch(e) {
		case "AZ":
			myComparator = (P1, P2) -> P1.getName().toUpperCase().compareTo(P2.getName().toUpperCase());
			break;
		case "ZA":
			myComparator = (P1, P2) -> P2.getName().toUpperCase().compareTo(P1.getName().toUpperCase());
			break;
		case "-+":
			myComparator = (P1, P2) -> P1.getValor().compareTo(P2.getValor());
			break;
		case "+-":
			myComparator = (P1, P2) -> P2.getValor().compareTo(P1.getValor());
			break;
		default:
			System.out.print("Escolha uma opção valida");
			break;
		}}
		sc.close();
		Lista.sort(myComparator);
		System.out.print(Lista);
		
	}

}