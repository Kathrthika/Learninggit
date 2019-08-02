package JavaPractice;

class Karthika{
	int a;
	Karthika(int b){
		this.a=b;
		System.out.println("Karthika from cons");
		System.out.println("a value"+a);
		System.out.println("b value"+b);
	}
	
	void sample1(int s1) {
		System.out.println("Karthika from method sample1");
		System.out.println(a+s1);		
	}
	void sample2(int s2) {
		System.out.println("Karthika from method sample2");
		System.out.println(a+s2);		
	}
	static void sample3() {
		System.out.println("Karthika from method sample3");
		//System.out.println("a value");		
	}
}

public class Learnconstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Karthika k1 = new Karthika(10);
		k1.sample1(11);
		k1.sample2(12);
		//Karthika.sample3();
		
		

	}

}
