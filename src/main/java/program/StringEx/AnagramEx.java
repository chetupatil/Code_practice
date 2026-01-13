package main.java.program.StringEx;

import java.util.Arrays;

public class AnagramEx {

	public static void main(String[] args) {
		String str1 = "abcd";
		String str2 = "dacb";
		
		char[] ch1 = str1.toCharArray();
		char[] ch2 = str2.toCharArray();
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		System.out.println(ch1);
		System.out.println(ch2);
		
		if(ch1==ch2) {
			System.out.println(str1 + " String is anagram : "+str2);
		}else {
			System.out.println(str1 + " String is not anagram : "+str2);
		}
		
	}

}
