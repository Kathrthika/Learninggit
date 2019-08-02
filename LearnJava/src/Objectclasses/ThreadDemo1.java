package Objectclasses;



class DThread extends Thread{
	public void run() {
		
		for(int i = 1; i<21;i++) {
			
			System.out.println("Print from Dthread "+i);
			try {
				Thread.sleep(1000);
			}
			catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
}
class EThread extends Thread{
	public void run() {
		
		for(int i = 101; i<121;i++) {
			
			System.out.println("Print from E thread "+i);
			try {
				Thread.sleep(1000);
			}
			catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
}

public class ThreadDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("program Starts");
		
		EThread eth = new EThread();
		DThread dth = new DThread();
		dth.start();
		eth.start();
		
		for(int k = 201;k<221;k++) {
			System.out.println("printing k from main "+k);
			try {
				Thread.sleep(1000);
			}catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	System.out.println("Program Ends");

	}

}
