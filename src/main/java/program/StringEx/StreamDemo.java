package main.java.program.StringEx;

import java.util.function.Supplier;
import java.util.stream.Stream;

public class StreamDemo {

	public static void main(String[] args) {
		
		
		// generate method implements
//		Supplier<Integer> supplier = new Supplier<Integer>() {
//			@Override
//			public Integer get() {
//				return 29;
//			}	
//		};
		
	    Stream.generate(() -> 29).forEach(i -> System.out.println(i));
		
		
		// of methos in stream implementation
		Stream<Integer> streamImp = Stream.of(1,2,3,4,5,6,7,8,9);
		streamImp.forEach(i -> System.out.println(i));
		
	}

}
