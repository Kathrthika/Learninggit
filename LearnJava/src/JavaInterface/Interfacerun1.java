package JavaInterface;

interface SampleA {
	void test1();
	
}
interface Sample3 extends SampleA{
	void test2();
}

class Testing implements Sample3{
	
	public void test1(){
		System.out.println("Running test1 method");
	}
	public void test2() {
		System.out.println("Running test2 method");
	}
}
public class Interfacerun1 {
	public static void main(String[] args) {
		System.out.println("Starts");
		Testing t = new Testing();
		t.test1();
		t.test2();
		System.out.println("Ends");
	}

}
