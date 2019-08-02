package Threadspractice;

public class ThreadTwo extends Thread {
	CommonResource cr=null;
	ThreadTwo(CommonResource cr){
		this.cr=cr;
	}
	public void run() {
		cr.resource2();
	}

}
