package Handling;

public class Exception1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Program Starts");
		
		int[] intArray = new int[5];
		
		int i = 10;
		int j = 0;
		try {
			System.out.println("Running Try block");
			
			j=i/0;
			
			System.out.println("Existing Try block");
			
		} 
	/*	catch (ArrayIndexOutOfBoundsException exp) {
			// TODO: handle exception
			exp.printStackTrace();
		    
			System.out.println("Running Catch1 block");
		}*/
		
		
	    catch (ArithmeticException ex) {
		// TODO: handle exception
	    	ex.printStackTrace();
		System.out.println("Running Catch2 block");
	}
		catch (Throwable e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("Throwable Exp");
		}
		
		
	
		
		System.out.println("Program Ends");

	}

}
