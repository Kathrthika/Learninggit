package Objectclasses;

public class TestMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Starts");
		System.out.println("Program Starts");
		for(int m=100;m<121;m++) {
			System.out.println("Printing m value from main ="+m);
			try {
				Thread.sleep(1000);
			}catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		System.out.println("Ends");

	}

}
