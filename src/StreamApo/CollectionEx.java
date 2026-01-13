package StreamApo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class CollectionEx {

	public static void main(String[] args) {
		
		Comparator<Integer> com = new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				if(o1<o2) {
					return 1;
				}else {
					return -1;
				}
			}
			
		};
	
		List<Integer> num =  new ArrayList<Integer>();
		num.add(5);
		num.add(3);
		num.add(4);
		num.add(1);
		
		Collections.sort(num,com);
	//	num.add("Chetana");
		
		System.out.println(num);
		
		
		List<Student> stList = new ArrayList<>();
		
		Student s = new Student();
		s.setId(1);
		s.setName("Chetana");
		s.setColleageName("BKIT");
		
		stList.add(s);
		
		Student s1 = new Student();
		s1.setId(2);
		s1.setName("Aakash");
		s1.setColleageName("Dayananda");
		
		stList.add(s1);
		
		Collections.sort(stList);
		
		for(Student sOb : stList) {
		System.out.println(sOb.getName() +"  "+sOb.getId()+"  "+sOb.getColleageName());
		}
		

//		Set<Integer> numS = new TreeSet<>();
//		numS.add(5);
//		numS.add(6);
//		
//		Iterator<Integer> i = numS.iterator();
//	
//		while(i.hasNext()) {
//		System.out.println(i.next());
//		}
	}

}
