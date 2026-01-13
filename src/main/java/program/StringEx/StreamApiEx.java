package main.java.program.StringEx;

import java.util.Arrays;
import java.util.List;

public class StreamApiEx {

	public static void main(String[] args) {
		Integer[] inAr = {1,2,3,4,5,6,7,8,9};
		
		List<Integer> lAr = Arrays.asList(inAr);
		
		lAr.stream().filter(i -> i>5).forEach(i -> System.out.println(i));
		

	}

}
