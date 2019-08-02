package JavaPractice;

import java.util.Scanner;

public class ConditionStatments {

	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Program Starts");
		System.out.println("**************");
		int a ;int b ;int c ;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value ");
		a = sc.nextInt();
		System.out.println("Enter b value ");
		b = sc.nextInt();
		System.out.println("Enter c value ");
		c = sc.nextInt();
		
		
		if(a>b&&a>c) {
			System.out.println("Biggest Number a:"+a);
			
		}
		else if (b>a&&b>c) {
			System.out.println("Biggest Number b :"+b);
			
		}
		else {
			System.out.println("Biggest Number c :"+c);
			
		}
		System.out.println("Program Ends");
		
		System.out.println("************");}
		
		
			 
		}
		
		
	
	


