package collectionEx;

import java.util.HashMap;
import java.util.Map.Entry;

public class FindLarAndSmallStr {

	public static void main(String[] args) {
		
		HashMap<Integer,String> hashM = new HashMap<Integer,String>();
		hashM.put(1, "Chetana");
		hashM.put(2, "Aakash");
		hashM.put(3, "Omkar");
		
		for(Entry<Integer, String> e1 : hashM.entrySet()) {
			System.out.println("Key :  "+e1.getKey()+" ------ "+"Value : "+e1.getValue());
			
		}

	}

}
