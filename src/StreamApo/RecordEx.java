package StreamApo;

import java.io.Serializable;
import java.util.Objects;

//class alien{
//	private int id;
//	private String name;
//	
//	alien(){}
//	
//	alien(int id,String name){
//		this.id = id;
//		this.name = name;
//	}
//
//	public int getId() {
//		return id;
//	}
//
//	
//	public String getName() {
//		return name;
//	}
//
//	@Override
//	public String toString() {
//		return "alien [id=" + id + ", name=" + name + "]";
//	}
//
//	@Override
//	public int hashCode() {
//		return Objects.hash(id, name);
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		alien other = (alien) obj;
//		return id == other.id && Objects.equals(name, other.name);
//	}
//	
//	
//}

record alien(int id, String name){
	
	alien{
	   if(id==0) {
		   throw new IllegalArgumentException("Id cannot be zero ");
	    }
	}
}

public class RecordEx {

	public static void main(String[] args) {
	
		alien a = new alien(1,"chetana");
		alien b = new alien(1,"chetana");
		
		System.out.println(a);
		
		System.out.println(a.equals(b));
		
	
	}

}
