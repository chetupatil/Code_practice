package StreamApo;


public class LinkedListEx {

	public static void main(String[] args) {
		
		LinkedListIm ll = new LinkedListIm();
		ll.insert(2);
		ll.insert(3);
		ll.insert(4);
		
		ll.insertAtStart(1);
		
		ll.insertAt(1,8);
		
		ll.deleteAt(3);
		
		ll.show();
	
		
	}

}
