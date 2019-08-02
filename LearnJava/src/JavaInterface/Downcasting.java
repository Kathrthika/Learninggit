package JavaInterface;

class Cat1{
	void test1() {
		System.out.println("Printing Cat1 class test1 ");
	}
}
class Cat2 extends Cat1{
	void test2() {
		System.out.println("Printing Cat2 class test2");
	}
}
class Cat3 extends Cat2{
	void test3() {
		System.out.println("Printing cat3 class test3");
	}
}

public class Downcasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Program Starts");
		Cat3 c3 = new Cat3();
		System.out.println("********");
		Cat1 a = (Cat1)c3;
		a.test1();
		System.out.println("********");
		Cat2 b = (Cat2)a;
		b.test1();
		b.test2();
		System.out.println("*********");
		c3.test1();
		c3.test2();
		c3.test3();
		System.out.println("Pringram Ented");

	}

}
