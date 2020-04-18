package examples;

import java.util.stream.IntStream;

public class SumOfIntegerStream {
	public static void main(String[] args) {
		System.out.println(IntStream.range(1, 3).sum()); // 1 + 2

		System.out.println(IntStream.rangeClosed(1, 3).sum()); // 1 + 2 + 3
	}
}
