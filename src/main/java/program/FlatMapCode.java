package main.java.program;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FlatMapCode {

	public static void main(String[] args) {

		List<String> str1 = Arrays.asList("Chetana","Omkar");
		List<String> str2 = Arrays.asList("Aakash","Hindoddi");

		List<List<String>> strArr = new ArrayList<>();
		strArr.add(str1);
		strArr.add(str2);


		List<String> finalWord = strArr.stream().flatMap(i -> i.stream()).toList();

		for(int i=0;i<finalWord.size();i++) {
			System.out.print(finalWord.get(i) +" ");
		}
		System.out.println();

	}

}
