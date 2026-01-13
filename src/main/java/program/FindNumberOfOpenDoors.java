package main.java.program;

import java.util.ArrayList;
import java.util.List;

public class FindNumberOfOpenDoors {
	// code is taking more time exceute the program
	public static void main(String[] args) {
		int finalNo = 7;
		int N=4;
		int j=1;
		List<Integer> openDoors = new ArrayList<>(); 
		while(N>0) {
			for(int i=1;i<=N;i++) {
				int k = i*j;
				if(k>finalNo) {
					break;
				}
				if(openDoors.contains(k)) {
					int l = openDoors.indexOf(k);
					openDoors.remove(l);
				}else {
					openDoors.add(k);
				}
			}
			j++;
			N--;
		}
		System.out.println("Number of open doors : "+openDoors.size());
	}

}
