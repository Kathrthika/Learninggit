package Threadspractice;

public class TwoThread extends Thread {
	
	CommonResource1 cr = null;
		
	TwoThread(CommonResource1 cr){
			this.cr=cr;
		}

		public void run() {
			cr.resource2();
		}
	
}
