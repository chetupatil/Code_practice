package main.java.program.StringEx.Telstra;

import java.util.ArrayList;
import java.util.List;

public class UniquePairsEx {

	public static void main(String[] args) {
		int[] ip = {1,2,3,4,5};
		int target = 6;
		List<List<Integer>> pairs = new ArrayList<>();
		
		for(int i=0;i<ip.length;i++) {
			List<Integer> p = new ArrayList<>();
			for(int j=1;j<ip.length;j++) {
				if(ip[i]+ip[j]==target) {
					p.add(ip[i]);
					p.add(ip[j]);
				}
			}
			pairs.add(p);
		}
		for(int i=0;i<pairs.size();i++) {
			System.out.print(pairs.get(i));
		}
	}

}
