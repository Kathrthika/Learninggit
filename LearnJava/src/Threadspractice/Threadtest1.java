package Threadspractice;

public class Threadtest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("program Starts");
		CommonResource1 crr1 = new CommonResource1();
		CommonResource1 crr2 = new CommonResource1();
		
		OneThread tt1 = new OneThread(crr1);
		TwoThread tt2 = new TwoThread(crr1);
		ThreeThread tt3 = new ThreeThread(crr1);
		FourThread tt4 = new FourThread(crr1);
		
		
		tt1.start();
		tt2.start();
		tt3.start();
		tt4.start();
		
		try {

		Thread.sleep(5000);
		System.out.println("Running Sleep Thread");
		
		
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		System.out.println("program Ends");
		

	}

}
