package JavaExam;

public class Stack {

	int cap = 5;
	int[] stack = new int[cap];
	int top=0;
	
	public void push(int data) {
		if(cap==size()) {
			expand();
		}
		
		stack[top] = data;
		top++;
	}
	
	private void expand() {
		int[] newStack = new int[cap*2];
		System.arraycopy(stack, 0, newStack, 0, cap);
		stack = newStack;
		
	}

	public void pop() {
		top--;
		stack[top] = 0;
	}
	public void peek() {
		int d = stack[top-1];
		System.out.println(d);
	}
	public int size() {
		return top;
	}
	public boolean isEmpty() {
		return top>0;
	}
	
	public void show() {
		for(int i=0;i<stack.length;i++) {
			System.out.print(stack[i]+" ");
		}
	}

	
}
