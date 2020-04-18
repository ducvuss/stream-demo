package examples;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamFromTextFile {

	public static void main(String[] args) {
		try(Stream<String> students = Files.lines(Paths.get("resources/students.txt"));) {
			students
			.sorted()
			.filter(x -> !(x.startsWith("J")))
			.forEach(System.out::println);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try(Stream<String> students = Files.lines(Paths.get("resources/students.txt"));) {
			List<String> results = students
			.sorted()
			.filter(x -> !(x.startsWith("J")))
			.collect(Collectors.toList());
			
			results
			.forEach(System.out::println);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
