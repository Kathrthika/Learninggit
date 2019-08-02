package JavaPractice;

class AA{
	String sample1() {
		System.out.println("sample1 of AA");
		return "test";
	}
	
	public static void test() {
		System.out.println("test-wewe");
	}
}
class BB extends AA{
	String sample1() {
		return super.sample1()+" awdsf";//System.out.println("sample1 of BB");
	}
}

public class Overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Starts");
		
		BB b = new BB();
		System.out.println(b.sample1());
		
		System.out.println("********");
		
		//AA a = new BB();
		BB bs=(BB)new AA();
		bs.sample1();
		//a.sample1();
		//a.test();
		System.out.println("Ends");

	}

}
