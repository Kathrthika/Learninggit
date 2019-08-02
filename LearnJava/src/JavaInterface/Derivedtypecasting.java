package JavaInterface;

class D{
	void test1() {
		System.out.println("Printing test1 of class D");
	}
}
class B extends D{
	void test2() {
		System.out.println("printing test2 of class B");
	}
}
class C extends B{
	void test3() {
		System.out.println("Printing test3 of class C");
	}
}

public class Derivedtypecasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Program Starts");
		C c= new C();
		c.test1();
		c.test2();
		c.test3();
		System.out.println("********Level 1*********");
		B b = (B)c;
		b.test1();
		b.test2();
		System.out.println("********Level 2********");
		D d = (D)c;
		d.test1();
		System.out.println("Program Ends");

	}

}
