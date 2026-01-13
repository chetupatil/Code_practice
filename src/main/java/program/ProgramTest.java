package main.java.program;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProgramTest {

	public static void main(String[] args) {
		
		String ip = "aabbbcddbb";
		
		char[] ipArr = ip.toCharArray();
		
		String op = "";
		int count = 1;
		for(int i=1;i<ipArr.length;i++) {
			
			if(ipArr[i-1]==ipArr[i]) {
				count++;
				op = op+ipArr[i-1]+""+count;
				
			}else {
				count=0;
			}
			
		}
		
		
		
		List<String> ipStr = new ArrayList<>(Arrays.asList(ip));
		
		System.out.println("");

	}

}
