package main.java.program.StringEx;

import java.util.Arrays;
import java.util.List;

public class FindFirstRepeatingNum {

	public static void main(String[] args) {

		List<Integer> a = Arrays.asList(10,7,8,1,8,7,6);
		boolean isFalse = true;
		int firstRepeatNo = 0;

		if(isFalse) {
			for(int i=0;i<a.size();i++) {
				for(int j=i+1;j<a.size();j++) {
					if(a.get(i).equals(a.get(j))) {
						firstRepeatNo = a.get(j);
						isFalse = false;
					}
				}
			}
		}
		System.out.println("First repeating number : "+firstRepeatNo);

	}

}
