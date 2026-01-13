package main.java.program;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamApisCode {

	public static void main(String[] args) {
//		List<Integer> list = Arrays.asList(3,2,5,6,7);
//		
//		Integer secondHighest  = list.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
//		
//		System.out.println("Second Highest value : "+secondHighest);
//		
//		// prime number
//		
//		Integer[] unOrder = {1,2,3,4,5,6,7};
//		
//		List<Integer> unOrderList = Arrays.asList(unOrder);
//		
//		unOrderList = unOrderList.stream().filter(i -> (i%2==0)).toList();
//		
//		for(int i=0;i<unOrderList.size();i++) {
//			System.out.print(unOrderList.get(i)+" ");
//			
//		}
//		System.out.println();
//		
//		Stream<Integer> arr = Stream.of(1,2,3,4,5,6,7);
//		Stream<Integer> arr1 = Stream.of(new Integer[]{1,2,3,4,5,6,7});
//		
//		arr.forEach(p -> System.out.print(p+" "));
//		System.out.println();
//		
//		arr1.forEach(p -> System.out.print(p+" "));
//		System.out.println();
//		
//		List<Integer> list1 = Arrays.asList(1,2,3,4,5,6);
//		Stream<Integer> streamList  = list1.stream();
//		System.out.println(streamList.count());
//		
//		Stream<Integer> randomNumbers = Stream.generate(() -> (new Random()).nextInt(100));
//		randomNumbers.limit(20).forEach(System.out::print);
//		
//		System.out.println();
//		
//		IntStream stream = "12345_abcdefg".chars();
//		stream.forEach(System.out::print);
		
		
//		List<String> memberNames = new ArrayList<>();
//		memberNames.add("Amitabh");
//		memberNames.add("Shekhar");
//		memberNames.add("Aman");
//		memberNames.add("Rahul");
//		memberNames.add("Shahrukh");
//		memberNames.add("Salman");
//		memberNames.add("Yana");
//		memberNames.add("Lokesh");
//		
//		boolean isAnyMatches1 = memberNames.stream().anyMatch(i ->i.startsWith("A"));
//		
//		boolean isAnyMatches2 = memberNames.stream().allMatch(i ->i.startsWith("A"));
//		
//		boolean isAnyMatches3 = memberNames.stream().noneMatch(i ->i.startsWith("C"));
//		
//		System.out.println("isAnyMatches 1 :"+isAnyMatches1);
//		
//		System.out.println("isAnyMatches 2 :"+isAnyMatches2);
//		
//		System.out.println("isAnyMatches 3 :"+isAnyMatches3);
//		
//		
//		Optional<String> meb = memberNames.stream().reduce((s1,s2) -> s1+" # "+s2);
//		
//		System.out.println("meb : "+meb.get());
//		
//		memberNames.stream()
//		.filter(i -> i.startsWith("A"))
//		.findFirst()
//		.ifPresent(System.out::println);
		
		
//		
//	// filter() method
//	
////		memberNames = memberNames.stream()
////				.filter(i -> (i).startsWith("S"))
////				.toList();
////		
//		
//		// map() method
//		
//		memberNames = memberNames.stream()
//				.sorted(Comparator.reverseOrder())
//				.filter(i -> i.startsWith("S"))
//				.map(String :: toUpperCase)
//				.toList();
//		
//		for(String member: memberNames) {
//			System.out.println(" "+member);
//		}
//		
//		Map<Integer,String> mapList = new HashMap<>();
//		mapList.put(1, "Chetana");
//		mapList.put(2, "Patil");
//		
//		List<Map<Integer,String>> listOfMap = Arrays.asList(mapList);
		
//		listOfMap.stream().filter(i->i.values())
//		.toList();
		
		//convert string to integer from array list using java8
		
		
//		
//		List<Integer> listNum = Arrays.asList(1,3,4,2,4,1,4,5,1);
//		
//		Integer largestNum = listNum.stream().distinct().sorted(Comparator.reverseOrder()).findFirst().get();
//	
//		System.out.println("Largest number : "+largestNum);
//		
		
//		List<String> names = Arrays.asList("One","Two","Three","Four");
//		
//		names = names.stream().filter(i -> (i.length() > 3))
//		.peek(i -> System.out.println("filter out : "+i))
//		.map(String :: toUpperCase)
//		.peek(i -> System.out.println("Mapped value : "+i))
//		.collect(Collectors.toList());
//		
//		for(int i=0;i<names.size();i++) {
//		System.out.print(names.get(i) +" ");
//		
//		}
		
		
//		Stream<Integer> numStream = Stream.iterate(0, n->n+3);
//
//		List<Integer> numList = numStream
//				.skip(3)
//				.limit(20).collect(Collectors.toList());
//		
//		for(int i=0;i<numList.size();i++) {
//			System.out.print(numList.get(i) +" ");
//			
//			}
//		
		
		List<Integer> list = Arrays.asList(2, 9, 4, 1,5);
		
//		list.stream().forEachOrdered( System.out::println );
		
//		
//		List<Integer> list = Arrays.asList(2, 4, 6, 8, 10); 
//		 
//		list.stream()
//		    .forEachOrdered( System.out::println );
		
		
//		Integer minNum = list.stream().min((i,j)-> i.compareTo(j)).get();
//		
//		Integer maxNum = list.stream().max((i,j)-> i.compareTo(j)).get();
//		
//		System.out.println(minNum);
//		
//		System.out.println(maxNum);
//		
		

		
		try {
		int n=0;
		int m=2;
		System.out.println(m/n);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		String name = new String("chetana");
		name = name.concat("Patil");
		// it will refer the instance by call name
		//name = "Patil";
		
		name = name.intern();
		
		System.out.println(name);
		
		
		
		
		
				
	}

}
