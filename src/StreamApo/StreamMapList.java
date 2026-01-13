package StreamApo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamMapList {

	public static void main(String[] args) {
		List<String> names = Stream.of("Chetana","Omkar","Aakash").toList();
		names.stream().map(String::toUpperCase).forEach(System.out::println);
		
		
		
		List<String> words = Arrays.asList("java", "spring", "boot");
		words.stream().map(String::length).forEach(System.out::print);
		
		List<List<String>> nestedWords = Arrays.asList(
				Arrays.asList("Hi ","Chetana"),
				Arrays.asList("I am good"),
				Arrays.asList("Hope your day is good")
				);
		
		nestedWords.stream().flatMap(List::stream)
		.forEach(System.out::print);
		
		
	}

}
