package StreamApo;

public class LinkedListIm {
	
	Node head;
	
	void insert(int data) {
		Node node = new Node();
		node.data = data;
		node.next = null;
		
		if(head==null) {
			this.head = node;
		}else {
			Node n = this.head;
			while(n.next!=null) {
				n = n.next;
			}
			n.next = node;
		}
	}
	
	public void insertAtStart(int data) {
		Node node = new Node();
		node.data = data;
		node.next=null;
		
		if(this.head==null) {
			this.head = node;
		}else {
			Node n = this.head;
			node.next = n;
		}
		this.head = node;
		
	}
	
	void show() {
		Node n = this.head;
		while(n.next!=null) {
			System.out.print(n.data+" ");
			n = n.next;
		}
		System.out.println(n.data);
	}

	public void insertAt(int index, int data) {
		
		if(index ==0) {
			insertAtStart(data);
		}else {
		
		Node node = new Node();
		node.data = data;
		node.next = null;
		
		Node n = this.head;
		
		for(int i=0;i<index-1;i++) {
			n = n.next;
		}
		node.next = n.next;
		n.next = node;

		}
	}
	public void deleteAt(int index) {
		Node n = this.head;
		Node n1 = this.head;
		for(int i=0;i<index-1;i++) {
			n = n.next;
		}
		n1 = n.next;
		n.next = n1.next;

		
	}

}
