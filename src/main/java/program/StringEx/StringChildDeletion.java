package main.java.program.StringEx;

import java.util.Arrays;

public class StringChildDeletion {

	public static void main(String[] args) {
		
		
		
		StringBuilder sb1 = new StringBuilder("SHINCHAN");
		StringBuilder sb2 = new StringBuilder("NOHARAAA");
		
		
		sb1.chars().distinct();
		sb2.chars().distinct();
		
		String s1 = sb1.toString();
		String s2 = sb2.toString();
		
		
		char[] sc1 = s1.toCharArray();
	
	
		
        int countDeletion = 0;
        for(int i=0;i<sc1.length;i++){
        	
            if(s2.indexOf(sc1[i])!=-1){
                countDeletion++;
            }
        }
        
        System.out.println("Count Deletion : "+countDeletion);

	}

}
