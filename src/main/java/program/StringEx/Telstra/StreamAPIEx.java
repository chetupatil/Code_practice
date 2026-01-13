package main.java.program.StringEx.Telstra;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPIEx {

	public static void main(String[] args) {
		
		List<String> name = Stream.of("Chetana","Omkar","Aakash").toList();
		
		name = name.stream().filter(i -> i.length()>4).collect(Collectors.toList());
		
		name = name.stream().map(String :: toUpperCase)
				.toList();
		
		String finStr = name.stream().reduce((a,b)-> a+b).orElse(null);
		
		System.out.println(finStr);
		
		name.stream().forEach(i -> System.out.println(i+" "));

	}

}
