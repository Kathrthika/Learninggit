package JavaPractice;
class A{
	int a = 10;
	double b = 1.1;	
	static void testClassA(){
		System.out.println("Test CalssA");
	}}
class B extends A{	
	double c =  1.2;
	float d = 2.3f;	
}
public class InheritA {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a1 = new A();
		B b1 = new B();
		System.out.println("a= "+a1.a);
		System.out.println("b= "+a1.b);
		A.testClassA();
		System.out.println("*********");
		System.out.println("a= "+b1.a);
		System.out.println("b= "+b1.b);
		System.out.println("c= "+b1.c);
		System.out.println("d= "+b1.d);
		B.testClassA();

	}}
