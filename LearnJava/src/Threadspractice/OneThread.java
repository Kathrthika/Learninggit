package Threadspractice;

public class OneThread extends Thread {
	CommonResource1 cr = null;
	
	OneThread(CommonResource1 cr){
		this.cr=cr;
	}

	public void run() {
		cr.resource1();
	}
}
