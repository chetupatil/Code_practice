package StreamApo;

import java.util.Comparator;
import java.util.stream.Stream;

public class StreamSoredList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stream.of("chetana","patil","Aakash")
		.filter(i -> i.length()>5)
		.sorted()
		.forEach(System.out::println);
		
		
		Stream.iterate(0, (i -> i+1))
		.limit(5)
		.sorted(Comparator.reverseOrder())
		.forEach(j -> System.out.println(j));
		
		Stream.of(1,3,4,5,2,9,8,6,7)
		.filter(i -> i<7)
		.map(nu -> nu*nu)
		.forEach(j -> System.out.println(j));
		
		System.out.println("****************************");
		
		Stream.of(1,3,4,5,2,9,8,6,7)
		.takeWhile(i -> i<7)
		.map(nu -> nu*nu)
		.forEach(j -> System.out.println(j));
		
       System.out.println("****************************");
		
		Stream.of(1,3,4,5,2,9,8,6,7)
		.dropWhile(i -> i<7)
		.map(nu -> nu*nu)
		.forEach(j -> System.out.println(j));
		
		System.out.println("******************");
		Stream.of("chetana","patil","Aakash")
		.takeWhile(i -> i.length()>5)
		.sorted()
		.forEach(System.out::println);
		
		System.out.println("******************");
		Stream.of("chetana","patil","Aakash")
		.skip(1)
		.forEach(System.out::println);
		
		System.out.println("******************");
		Stream.of("chetana","patil","patil","Aakash")
		.distinct()
		.forEach(System.out::println);
		
	
	}

}
