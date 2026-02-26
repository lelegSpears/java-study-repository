package generics;

import java.util.ArrayList;
import java.util.List;

public class PrintService<T> {
	private List<T> lista = new ArrayList<>();
	
	public void addValue(T numero) {
		lista.add(numero);
	}
	
	public T first(){
		if(lista.isEmpty()) {
			throw new IllegalStateException("A lista esta vazia.");
		}
		return lista.get(0);
		}
	
	public void print() {
		System.out.printf("[ " +  lista.get(0));
		for(int i=1;i<lista.size();i++) {
			System.out.print(", " + lista.get(i));
		}
		System.out.printf(" ]");
	}
}
