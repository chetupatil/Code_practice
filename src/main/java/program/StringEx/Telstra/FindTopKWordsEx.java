package main.java.program.StringEx.Telstra;

import java.util.Arrays;
import java.util.List;

public class FindTopKWordsEx {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("a", "bb", "ccc");
		System.out.println(list.stream().map(String::length).reduce(0, Integer::sum));
	}

}
