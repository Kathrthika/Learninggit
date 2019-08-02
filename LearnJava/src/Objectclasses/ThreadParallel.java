package Objectclasses;

class Gthread implements Runnable{
	
	public void run() {
		for(int k =1;k<21;k++) {
			System.out.println("Printing k ="+k);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}
	
}

public class ThreadParallel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("program Starts");
		
		Gthread gthr = new Gthread();
		Thread nthr = new Thread(gthr);
		nthr.start();
		
		System.out.println("program Ends");

	}

}
