package JavaExam;

public class Queue {
	
	int[] queue = new int[5];
	int size;
	int front;
	int rear;
	
	public void enQueue(int data) {
		queue[rear] = data;
		rear = (rear+1)%5;
		size++;
	}
	public void deQueue() {
		int data = queue[front];
		queue[front] = 0;
		front  = (front+1)%5;
		size--;
	
	}
	public void show() {
		for(int i=0;i<size;i++) {
			System.out.print(queue[(front+i)%5]+" ");
		}
		System.out.println();
		
		for(int n : queue) {
			System.out.print(n+" ");
		}
	}

}
