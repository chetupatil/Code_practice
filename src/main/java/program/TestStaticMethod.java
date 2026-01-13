package main.java.program;

public class TestStaticMethod extends TestSuperClass{
	
	static void testSt() {
		System.out.println("test static method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestStaticMethod.testSt();
		TestSuperClass.testSt();

	}

}
