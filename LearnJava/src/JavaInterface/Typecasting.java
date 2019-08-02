package JavaInterface;

class A{
	void test1(double d) {
		System.out.println("Printing d value ="+d);
	}


	void test1(int a)
	{
		System.out.println("Printing a value"+ a);
	
}
}
public class Typecasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a1 = new A();
		a1.test1((double)12);
		a1.test1(12);
		

	}

}
