package Threadspractice;

public class CommonResource1 {
	
	synchronized public void resource1() {
		System.out.println("Running Resource1");
		
		String th1name = Thread.currentThread().getName();
		System.out.println("Current running thread name"+th1name);
		
		try {
			
			System.out.println(th1name+"is entering into wait State");
			wait();
		}
		catch(InterruptedException e){
			e.printStackTrace();
			
		}
		System.out.println("Stopped Resource1 ");
	}
	
	synchronized public void resource2() {
		System.out.println("Running Resource2");
		
		String th2name = Thread.currentThread().getName();
		System.out.println("Current running thread name"+th2name);
		System.out.println("notifing thread is in wait State");
		
	
		notifyAll();
		
		System.out.println("Stopped Resource2 ");
		
			
		
		
	}

}
