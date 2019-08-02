package JavaPractice;

import java.util.Scanner;

class Area{
	int r;
	
	double	d; 
	Area(int r){
		this.r = r;		
			d = 3.14*r*r;
			System.out.println("Area of the Circle = "+d);
		
	}
}

class StudentDetails{
String sname = "Karthik";
int sid = 100;
	
}

public class AreaOfTheCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius value");
		Area a = new Area(sc.nextInt());

	}

}
