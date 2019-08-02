package Threadspractice;

public class FourThread extends Thread {
	
	CommonResource1 cr = null;
		
	FourThread(CommonResource1 cr){
			this.cr=cr;
		}

		public void run() {
			cr.resource2();
		}
	
}
