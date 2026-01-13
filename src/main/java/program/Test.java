package main.java.program;

public class Test {

	public static void main(String[] args) {
		String s1 = "Text";
		String s2 = "Text";
		String s3 = new String("Text");
		
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));

	}

}
