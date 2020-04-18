package examples;

import java.util.Arrays;

public class AverageDemo {

	public static void main(String[] args) {
		Arrays.stream(new double[] {1, 2, 3, 4, 5, 6})
		.map(Math::sqrt)
		.average()
		.ifPresent(System.out::println);
	}

}
