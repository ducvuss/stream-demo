package examples;

import java.util.Arrays;
import java.util.List;

public class StreamFromArrayDemo {

	public static void main(String[] args) {
		String[] people = {"John", "James", "Jimmy", "Joe"};
		Arrays.stream(people)
		.filter(person -> person.startsWith("J"))
		.sorted()
		.forEach(person -> System.out.println(person));
		
		List<String> samePeople = Arrays.asList("John", "James", "Jimmy", "Joe");
		samePeople
		.stream()
		.map(String::toLowerCase)
		.filter(x -> x.startsWith("j"))
		.forEach(System.out::println);
	}

}
