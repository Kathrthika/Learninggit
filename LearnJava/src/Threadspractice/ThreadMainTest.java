package Threadspractice;

public class ThreadMainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("program Starts");
		
	  CommonResource cr1 = new CommonResource();
	  CommonResource cr2 = new CommonResource();
	  
	  ThreadOne th1 = new ThreadOne(cr1);
	  ThreadTwo th2 = new ThreadTwo(cr2);
	  
	   th1.start();
	  th2.start();
	  System.out.println("program Ends");
		
		
		

	}

}
