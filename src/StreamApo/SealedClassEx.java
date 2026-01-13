package StreamApo;


sealed interface chetana permits A01,D1{
	
}

sealed class A01 implements chetana permits B01,C01{
	
}
non-sealed class B01 extends A01 {
	
}
final class C01 extends A01{
	
}
final class D1 extends B01 implements chetana{
	
}


public class SealedClassEx {
	
	public static void main(String[] args) {
		
	}

}
