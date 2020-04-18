package examples;

import java.util.stream.Stream;

public class ReduceStreamDemo {
	public static void main(String[] args) {
		double total = Stream.of(5.6, 1.5, 4.6)
				.reduce(0.0, (Double a, Double b) -> a + b);
		
		System.out.println("Total = " + total);
	}

}
