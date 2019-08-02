package JavaInterface;

interface Parent1
{
	void test();
	
}
class Child implements Parent1{
	public void test() {
		System.out.println("Running Child class test");
	}
}

public class Sample1 {
	public static void main(String[] args) {
		System.out.println("Starts");
		Parent1 c = new Child();
		c.test();
		System.out.println("Ends");
	}

}
