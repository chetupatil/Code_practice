package main.java.program;

import java.util.ArrayList;
import java.util.List;

public class CurrentAndDesiredArr {

	public static void main(String[] args) {
		List<Integer> current = new ArrayList();
		current.add(1);
		current.add(3);
		current.add(5);
		current.add(6);
		List<Integer> desired = new ArrayList();
		desired.add(1);
		desired.add(6);
		desired.add(3);
		desired.add(5);
		
		List<Integer> newcurrent = new ArrayList();
		
		int endIndex = current.size()-1;
		int stepCount = 0;
		
		for(int i=0;i<current.size();i++) {
			System.out.print(" " +current.get(i)+" ");
		}
		System.out.println();
		newcurrent = current;
//		while(endIndex>0) {
//			int value = current.get(endIndex);
//			newcurrent.set(1, value);
//			if(newcurrent.equals(desired)) {
//				break;
//			}
//			stepCount++;
//			endIndex--;
//		}
		
		for(int i=1;i<current.size()-1;i++) {
			newcurrent.set(1, current.get(current.size()-1));
			newcurrent.set(i+1, current.get(i));
			//current = newcurrent;
			if(newcurrent.equals(desired)) {
				break;
			}
		}
		for(int i=0;i<current.size();i++) {
			System.out.print(" " +current.get(i)+" ");
		}
		System.out.println();
		
		
		
//		for(int i=0;i<newcurrent.size();i++) {
//			System.out.print("Current Array -> " +newcurrent.get(i)+" ");
//		}
//		System.out.println();
//		
//		for(int i=0;i<desired.size();i++) {
//			System.out.print("Desired Array -> "+desired.get(i)+" ");
//		}
	//	System.out.println();
		
		System.out.println("stepCount : "+stepCount);

		
	}

}
