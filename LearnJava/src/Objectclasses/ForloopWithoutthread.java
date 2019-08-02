package Objectclasses;

public class ForloopWithoutthread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int l = 0;l<=10;l++) {
			System.out.println("printing L"+l);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}

	}

}
