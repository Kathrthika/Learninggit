package Threadspractice;

public class CommonResource {
	
	synchronized public void resource1() {
		
		System.out.println("Running Resource 1");
		String thname = Thread.currentThread().getName();
		System.out.println(thname);
		
		for(int m=100;m<121;m++) {
			//System.out.println("Printing m value from main ="+m);
			System.out.println("Printing m value from main ="+m);
			try {
				Thread.sleep(5000);
			}catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		System.out.println("Stopped Resource 1");
		
	}
synchronized public void resource2() {
		
		System.out.println("Running Resource 2");
		String thname1= Thread.currentThread().getName();
		System.out.println(thname1);
		
		for(int n=200;n<221;n++) {
			System.out.println("Printing n value from main ="+n);
			try {
				Thread.sleep(1000);
			}catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		System.out.println("Stopped Resource 2");
		
	}
		
	}


