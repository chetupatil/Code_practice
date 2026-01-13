package JavaExam;

public class StackTest {

	public static void main(String[] args) {
		
		
		Stack s = new Stack();
		s.push(2);
		s.push(3);
		s.push(5);
		s.peek();
		s.push(7);
		s.push(8);
		s.push(9);
		//s.pop();
		//s.pop();
		//s.pop();
		System.out.println(s.size());
		System.out.println(s.isEmpty());
		s.show();

	}

}
