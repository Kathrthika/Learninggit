package Threadspractice;

public class ThreeThread extends Thread {
	
	CommonResource1 cr = null;
		
	ThreeThread(CommonResource1 cr){
			this.cr=cr;
		}

		public void run() {
			cr.resource2();
		}
	
}
