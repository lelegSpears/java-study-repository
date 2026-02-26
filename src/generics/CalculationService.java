package generics;

import java.util.List;

public class CalculationService {
	public static <T extends Comparable<T>> T max(List<T> lista) {
		T max = lista.get(0);
		for(T item : lista) {
			if(item.compareTo(max) > 0) {
				max = item;
			}
		}
		return max;
	}
}
