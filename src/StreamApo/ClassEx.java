package StreamApo;

class hi extends Thread{
	
	
	public void run() {
		
		for(int i=0;i<10;i++) {
		    System.out.println("Hi");
		}
		
	}
	
}
class hello extends Thread{
	
     public void run() {
    	 for(int i=0;i<10;i++) {
    	     System.out.println("Hello");
    	 }
	}
	
}

class hi1 implements Runnable{
	
	
	public void run() {
		
		for(int i=0;i<100;i++) {
		    System.out.println("Hi");
		}
		
	}
	
}
class hello1 implements Runnable{
	
     public void run() {
    	 for(int i=0;i<100;i++) {
    	     System.out.println("Hello");
    	 }
	}
	
}

class incr{
	int a;
	public void increment() {
		 a++;
	}
}

public class ClassEx {

	public static void main(String[] args) {
		
//		hi1 h = new hi1();
//		hello1 ho = new hello1();
////		
//		Thread t1  =  new Thread(new hi1());
//		Thread t2  =  new Thread(new hello1());
//		t2.setPriority(Thread.MAX_PRIORITY);
//		
//		t1.start();
//		t2.start();
		
		incr in = new incr();
	
		Runnable tn = new Runnable() {
			@Override
			public void run() {
				for(int i=0;i<1000;i++) {
					in.increment();
					//System.out.println("Hello");
				}
				
				
				
			}
			
		};
		Thread trn = new Thread(tn);
		trn.start();
		
		Runnable tn1 = new Runnable() {
			@Override
			public void run() {
				for(int i=0;i<1000;i++) {
					in.increment();
				    // System.out.println("Hi");
				}
				in.increment();
			}
		};
		Thread trn1 = new Thread(tn1);
		trn1.start();
		
		
	}

}
