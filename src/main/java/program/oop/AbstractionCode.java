package main.java.program.oop;

 public class AbstractionCode {
	
	public static void main(String[] args) {
		System.out.println("Run main application");
		b bobj = new b();
		bobj.a1();
		bobj.aDefualt();
		
		
	}
	
	

}
 abstract class a{
		abstract void a1();
		void aDefualt() {
			System.out.println("a defualt class should implement");
		}
	}
	
class b extends a{
       @Override
		void a1() {
			System.out.println("a1 class should implement");
		}
	}
	
