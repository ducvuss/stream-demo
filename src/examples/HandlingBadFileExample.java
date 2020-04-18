package examples;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class HandlingBadFileExample {

	public static void main(String[] args) {
		try(Stream<String> students = Files.lines(Paths.get("resources/studentsWithBadRows.txt"));) {
			int rowCount = (int)students
			.map(x -> x.split(","))
			.filter(x -> x.length == 2)
			.count();
			
			System.out.println(rowCount);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		try(Stream<String> students = Files.lines(Paths.get("resources/studentsWithBadRows.txt"));) {
			int rowCount = (int)students
			.map(x -> x.split(","))
			.filter(x -> x.length == 2)
			.map(x -> Integer.parseInt(x[0]))
			.filter(x -> x > 2)
			.count();
			
			System.out.println(rowCount);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
