package Handling;

public class FinallyBloco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Program Starts with git branch");
		
		int i = 10;
		int j=0;
		try {
			System.out.println("Running Try Block");
			
			j= i/0;
			System.out.println("Exisitng Catch block");
			
			
		} catch (Throwable e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally {
			System.out.println("i= "+i);
			System.out.println("j= "+j);
		}
		
		
		System.out.println("Program Ends");

	}

}
