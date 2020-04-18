package examples;

import java.util.stream.Stream;

public class StreamOfDemo {

	public static void main(String[] args) {

		Stream.of("Adam", "Abi", "Abe")
		.sorted()
		.findFirst()
		.ifPresent(System.out::println);
		
		Stream.of(1, 3, 4)
		.sorted()
		.findFirst()
		.ifPresent(System.out::println);
		
	}

}
