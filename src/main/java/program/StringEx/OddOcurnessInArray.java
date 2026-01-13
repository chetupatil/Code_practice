package main.java.program.StringEx;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OddOcurnessInArray {
	public static void main(String[] args) {
		
		List<Integer> arrs = Arrays.asList(9, 3, 9, 3, 9, 7, 9);
		List<Integer> arrF = new ArrayList<>();
		arrF.addAll(arrs);
		
		for(int i=0;i<arrs.size();i++) {
			for(int j=1;j<arrF.size();j++) {
				if(arrs.get(i).equals(arrF.get(j))) {
					arrF.remove(arrs.get(j));
				}
			}
		}
		
		
		for(int i=0;i<arrF.size();i++) {
			System.out.print(arrF.get(i)+" ");
		}
		System.out.println();
	}
}
