package examples;

import java.util.Arrays;

public class StreamFromArrayDemo {

	public static void main(String[] args) {
		String[] people = {"John", "James", "Jimmy", "Joe"};
		Arrays.stream(people)
		.filter(person -> person.startsWith("J"))
		.sorted()
		.forEach(person -> System.out.println(person));
	}

}
