package examples;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamToMapExample {
	public static void main(String[] args) {
		try(Stream<String> students = Files.lines(Paths.get("resources/studentsWithBadRows.txt"));) {
			Map<String, Integer> map = students
			.map(x -> x.split(","))
			.filter(x -> x.length == 2)
			.collect(Collectors.toMap(x -> x[1], x -> Integer.parseInt(x[0])));
			
			for (String key: map.keySet()) {
				System.out.println(key + " " + map.get(key));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
