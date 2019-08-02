package Objectclasses;
class Hthread{
	public void run() {
		for(int h=1;h<10;h++) {
			System.out.println("Printing h value ="+h);
			try {
				Thread.sleep(1000);
			}catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}
	
	public void start() {
		System.out.println("Runig Start method");
		this.run();
		
	}
}

public class ThreadOver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Program Starts");
		
		Hthread hthr = new Hthread();
		hthr.start();
		
		for(int m=100;m<121;m++) {
			System.out.println("Printing m value from main ="+m);
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
