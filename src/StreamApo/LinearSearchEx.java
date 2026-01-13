package StreamApo;

import java.util.Arrays;
import java.util.List;

public class LinearSearchEx {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15);
		int target = 11;
		
		long lStart = System.nanoTime();
		int linearResult = linearSearch(list,target);
		System.out.println("Binary search : "+linearResult);
		long lEnd = System.nanoTime();
		
		long linearTime = lEnd-lStart;
		System.out.println("Linear Time : "+linearTime);
		
		
		long bStart = System.nanoTime();
		int binaryResult = binarySearch(list,target);
		System.out.println("Binary search : "+binaryResult);
		long bEnd = System.nanoTime();
		
		long binaryTime = bEnd-bStart;
		
		System.out.println("Binary Time : "+binaryTime);

				
				

	}
	
	static int linearSearch(List<Integer> list, int target) {
		
		for(Integer l : list) {
			if(l.equals(target)) {
				return list.indexOf(l);
			}
		}
		
		return -1;
		
	}

	static int binarySearch(List<Integer> list, int target) {
		// Arrays.asList(1,2,3,4,5,6,7,8,9);
		int left = 0;
		int right = list.size();
		int mid =0;

		while(left<=right) {
			mid = (left+right)/2;
			if(list.get(mid)==target) {
				return mid;
			}
			if(list.get(mid)>target) {
				right = mid+1;
			}
			if(list.get(mid)<target) {
				left = mid-1;
			}
		}
		return mid;
	}

}
