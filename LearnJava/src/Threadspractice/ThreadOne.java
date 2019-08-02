package Threadspractice;

public class ThreadOne extends Thread {
	
	CommonResource cr = null;
	ThreadOne(CommonResource cr){
		this.cr=cr;
	}
	
	public void run() {
		cr.resource1();
	}
	
	
	

}
