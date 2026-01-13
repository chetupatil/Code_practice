package main.java.program.oop;

public class EncapsulationImpl {

	public static void main(String[] args) {
		emp e = new emp();
		e.setId(1);
		e.setName("Chetana");
		
		System.out.println(e.getId());
		System.out.println(e.getName());
		
	}

}

class emp{
	private String name;
	private int id;

	
	public String setName(String name) {
		return this.name = name;
	}
	public int setId(int id) {
		return this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public int getId() {
		return id;
	}
}
