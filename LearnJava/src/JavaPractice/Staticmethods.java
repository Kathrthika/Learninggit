package JavaPractice;

class Type1{
	 int a;
	 int b;
	 int c;
	 static double d = 100.00;
	 final static int f = 1000;
	
	Type1(int aa,int bb, int cc){
		this.a=aa;
		this.b=bb;
		this.c=cc;
	}
	static void sample() {
		d = 150;
	}	
	 void type1() {
		System.out.println("static type1 method of Type1");
		System.out.println(a);
		System.out.println( "d Value"+d);
		System.out.println(f);
		
	}
	 void type2() {
		System.out.println("static type2 method of Type1");
		System.out.println(f);
		System.out.println( "d Value"+d);
	}
	void type3() {
		System.out.println("non static type3 method of Type1");
		System.out.println(f);
		System.out.println( "d Value"+d);
	}
	
	
}
class Type3{
	static int e = 100;
}
class Type2 extends Type1{
	Type2(int aaa,int bbb, int ccc){
		super(aaa,bbb,ccc);
		
	}
	 void type4() {
		
		System.out.println(" type4 method of Type2");
		System.out.println( "d Value"+d);
		System.out.println(Type3.e);
		System.out.println(f);
	}
	
}

class Useme {
	void Useme (Type1 tt){
		tt.type1();
		tt.type2();
		tt.type3();
		
	}
	
}



public class Staticmethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Type2 t2 = new Type2(12,13,14);
		t2.type1();
		t2.type2();
		t2.type3();
		t2.type4();
		Type1 t1 = new Type1(1,2,3);
		Type1.sample();
		t1.type1();*/
		//Type1 t1 = ;
		
		Useme us1 = new Useme();
		
		
		
		
	
		

	}

}
