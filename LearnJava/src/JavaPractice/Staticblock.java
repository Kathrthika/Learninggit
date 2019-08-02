package JavaPractice;

class Krishna{
	static int a;
	static int b;
	static int c; 
	
	{
		a=100;
		b=200;
	    c=300;}
	
	
	
	void sample1() {
		System.out.println(a+" "+b+" "+c);
	}
	
	
}


public class Staticblock {
	static {
		System.out.println("Satic block on");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Starts");
	    Krishna k1 = new Krishna();
	    k1.sample1();

	}

}
