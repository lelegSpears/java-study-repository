package functional;

import java.util.Arrays;
import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;


public class StreamExample {

	public static void main(String[] args) {
		List<Integer> listaReduce = Arrays.asList(1, 2, 4, 6);
		int numeroFinal = listaReduce.stream().reduce(1, (x, y) -> x * y);
		System.out.println(numeroFinal);
		
		Stream<Double> iterateS = Stream.iterate(0.0, x -> x + 4.4).limit(15);
		iterateS.forEach(System.out::println);
		
		Stream<String> nomesFilter = Stream.of("Everton", "Lucas", "Rafael", "Khazix").filter(x -> x.toUpperCase().charAt(0) == 'E');
		nomesFilter.forEach(System.out::println);
		
		Stream<String> produtoFilter = Stream.of(new Produto("PC", 4000.0), new Produto("Air Fryer", 400.0), new Produto("Notebook", 3000.0))
				.filter(p -> p.getValor() <= 3000.0).map(Produto::getName);   
		produtoFilter.forEach(System.out::println);
		
		DoubleStream lista = Stream.of(1, 2, 5, 6).mapToDouble(x -> x * 10.0);
		lista.forEach(System.out::println);
		
		Stream<Long> fibonacci = Stream.iterate(new Long[] {0L, 1L}, x -> new Long[] {x[1], x[0] + x[1]}).map(x -> x[0]).limit(20);
		fibonacci.forEach(System.out::println);
	}
}
