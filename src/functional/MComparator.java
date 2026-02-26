package functional;

import java.util.Comparator;

public class MComparator implements Comparator<Produto> {

	@Override
	public int compare(Produto P1, Produto P2) {
		
		return P1.getName().toUpperCase().compareTo(P2.getName().toUpperCase());
	}
	
}
