package JavaPractice;

import java.util.Scanner;

class Studentrun {
	private int id = 123;
	private int mark = 1234;
	
	
	public int getid() {
		return id;
	}
	
	public int getmark() {
		return mark;
	}
	
	public void setid(int id) {
		this.id = id;
	}
	public void setmark(int mark) {
		this.mark = mark;
	}

}

public class Student{
	public static void main(String[] args) {
		Studentrun s = new Studentrun();
		System.out.println(s.getid());
		System.out.println(s.getmark());
		s.setid(1111);
		s.setmark(2222);
		
		System.out.println(s.getid());
		System.out.println(s.getmark());
		Scanner sc = new Scanner(System.in);
		/*System.out.println("Enter");
		int nu = sc.nextInt();
		System.out.println("Entered = "+nu);
		*/
		String kk = "Karthika";
		System.out.println(kk.substring(0,7));
		System.out.println(kk.substring(1,7));
		System.out.println(kk.substring(2,7));
		System.out.println(kk.substring(3,7));
		System.out.println(kk.substring(4,7));
		System.out.println(kk.substring(5,7));
		System.out.println(kk.substring(6,7));
		System.out.println(kk.substring(7,7));
		System.out.println();
		System.out.println(kk.substring(3,5));
		
		
		
		
	}
	
}
