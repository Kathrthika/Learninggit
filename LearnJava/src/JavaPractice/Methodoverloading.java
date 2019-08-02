package JavaPractice;

class Model {
	
	void model1() {
		System.out.println("Without argument");
	}
	void model1(int a) {
		System.out.println("Printing a value = "+a);
	}
	void model1(int a, int b) {
		System.out.println("Printing a = "+a+" "+"Printing b = "+b);
	}
	
}

public class Methodoverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Starts");
  Model m = new Model();
  m.model1();
  m.model1(10);
  m.model1(20, 30);
	}

}
