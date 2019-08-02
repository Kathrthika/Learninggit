package Handling;

public class ArithException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Program Starts");
		
		int i=10;
		int j =0;
		System.out.println("i="+i);
		System.out.println("j="+j);
		
		
		System.out.println("Program Ends");
		
		try {
			System.out.println("Running Try Block");
			j=i/0;
			System.out.println("Exisitng Catch block");
			
		} catch(ArithmeticException exp) {
			exp.printStackTrace();
			System.out.println("Exp = "+exp);
			System.out.println("Running Catch Block");
		}
		finally {
			System.out.println("finally");
			System.out.println("i="+i);
			System.out.println("j="+j);
		}
			// TODO: handle exception
	
		}
	

	}


