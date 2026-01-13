package collectionEx;

import java.util.ArrayList;
import java.util.Iterator;

public class ListSortEx1 {

	public static void main(String[] args) {
		ArrayList<String> name = new ArrayList<>();
		name.add("Patil");
		name.add("Chetana");
		
		Iterator iNam = name.iterator();
		while(iNam.hasNext()) {
		System.out.println(iNam.next());
		}

	
//		for(String na : name) {
//			System.out.println(na);
//		}	
//		HashMap<Integer,String> names = new HashMap<Integer,String>();
//		names.put(1, "Chetana");
//		names.put(2, "Patil");
//		names.put(1, "Chetu");
//
//		System.out.println(names);
//		
//		HashSet<String> names = new HashSet<String>();
//		names.add("Chetana");
//		names.add("Patil");
//		names.add("Chetana");
//		names.add("Patil");
//		
//		System.out.println(names);	
	}
}
