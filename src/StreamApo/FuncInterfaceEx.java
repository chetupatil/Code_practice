package StreamApo;

@FunctionalInterface
interface aInf{
	int add(int i, int j);
	
	static void config() {
		
	}
	default void config1() {
		
	}
	
    static void config2() {
		
	}
    
    default void config3() {
		
	}
}

public class FuncInterfaceEx {

	public static void main(String[] args) {
		
		aInf f = (i,j) -> i+j;
		int r = f.add(3,2);
		
		System.out.println("r : "+r);
		

	}

}
