package main.java.program;

public class AnagamStringCode {

	public static void main(String[] args) {
		String a = "fcrxzwscanmligyxyvym";
		String b = "jxwtrhvujlmrpdoqbisbwhmgpmeoke";
		char[] ac = a.toCharArray();
	     char[] bc = b.toCharArray();
	     
	     int deletionCount = 0;
	     
	     
	     
	     for(int i=0;i<ac.length;i++){
	       if(b.indexOf(ac[i])==-1){
	        deletionCount++;
	        System.out.println(ac[i] + " String : ( "+b +" )  "+deletionCount);
	       }
	     }
	     for(int i=0;i<bc.length;i++){
	       if(a.indexOf(bc[i])==-1){
	        deletionCount++;
	        System.out.println(bc[i] + " String : (  "+a +" )  "+deletionCount);
	       }
	     }
	     System.out.println("Deletion Count : "+deletionCount);
	     

	}

}
