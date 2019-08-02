package Objectclasses;

import java.util.Scanner;

class School{
	School(){
		System.out.println("school constructor");
	}
	static void schoolmethod() {
		System.out.println("printing schoolmethod");
	}
	void schooltestmethod1() {
		System.out.println("printing schooltestmethod1");
	}

}
class ClassRoom1 extends School{
	void classRoom1method() {
		System.out.println("classRoom1method");
	}
}

public class Objectarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Program Starts");
		Object[] objarr1 = new Object[7];
		objarr1[0] = "Karthik";
		objarr1[1] = new School();
		objarr1[2] = new ClassRoom1() ;
		objarr1[3] = new String("kk") ;
		objarr1[4] = new StringBuffer("Karthika buff");
		objarr1[5] = new StringBuilder("Karthika builder");
		objarr1[6] =  new Scanner(System.in);
		
		for(Object obj :objarr1 ) {
			System.out.println(obj);
			
		}
		

	}

}
