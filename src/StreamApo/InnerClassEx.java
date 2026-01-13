package StreamApo;


class a1{
	
   void methodA() {
	   System.out.println("hello i am in method A");
	}
	
	class b1{
		
		void methodB() {
			System.out.println("hello i am in method b");
		}
		
		
		static class c1{
			
			void methodC() {
				System.out.println(" Hello i am in method c");
			}
		}
		
	}
	
	
}
public class InnerClassEx {

	public static void main(String[] args) {
		a1 aex = new a1();
		aex.methodA();
		
		a1.b1 ab1= aex.new b1();
		ab1.methodB();
		
		
		a1.b1.c1 abc1 = new a1.b1.c1();
		abc1.methodC();

	}

}
