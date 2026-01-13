package main.java.program.StringEx;

public class InsertStringIntoMainString {

	public static void main(String[] args) {
		
		String orgString = "Computer Portal";
		String insertedString = "Science";
		int indexed = 8;
		
		String spilt = orgString.substring(0,8);
		spilt = spilt.concat(" "+insertedString);
		spilt = spilt.concat(orgString.substring(indexed, orgString.length()));
		
		
		System.out.println(spilt);
		
		
		StringBuilder sb = new StringBuilder(orgString);
		
		sb.insert(indexed, " "+insertedString);
		
		System.out.println(sb);
		
		

	}

}
