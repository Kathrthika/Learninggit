package Objectclasses;

class AThread extends Thread{
	public void run() {
		
		for(int i=1;i<25;i++){
			
			System.out.println("i from A "+i);
			try {
				Thread.sleep(1000);
			}catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			
		}
	}
	
}
class BThread extends Thread{
	public void run() {
		
		for(int i=100;i<125;i++){
			
			System.out.println("i from B "+i);
			try {
				Thread.sleep(2000);
			}catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			
		}
	}
	
}

class CThread implements Runnable{
	public void run() {
	for(int i=100;i<125;i++){
			
			System.out.println("i from c "+i);
			try {
				Thread.sleep(2000);
			}catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
	}
}}



public   class ThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Program Starts");
		AThread th1 = new AThread();
		BThread th2 = new BThread();
		th1.start();
		th2.start();
		th1.run();
		
		/*CThread th3 = new CThread();
		Thread newTh = new Thread(th3);
		newTh.start();
		
            for(int i=200;i<225;i++){
			
			System.out.println("i from main "+i);
			try {
				Thread.sleep(2000);
			}catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}*/
		
		System.out.println("program Ends");

	}

}
