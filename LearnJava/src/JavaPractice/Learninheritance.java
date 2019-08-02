package JavaPractice;

class Krishnaa{
	public String str = "Karthik";
	void sample1() {
		System.out.println("Krishna class sample1 ");
		
	}
   void sample2() {
	   System.out.println("Krishna class sample2 ");
		
	}
	
}

class Karthik extends Krishnaa{
	void sample1() {
		System.out.println("Karthik class sample1 ");
		
	}
   void sample2() {
	   System.out.println("Karthik class sample2 ");
		
	}
    void sample3() {
    	System.out.println("Karthik class sample3 ");
		
	}
    void sample4() {
    	System.out.println("Karthik class sample4 ");
	
    }
	
}

class Akash extends Karthik{
	void sample1() {
		System.out.println("Akash class sample1 ");
		
	}
   void sample2() {
	   System.out.println("Akash class sample2 ");
		
	}
    void sample3() {
    	System.out.println("Akash class sample3 ");
		
	}
    void sample4() {
    	System.out.println("Akash class sample4 ");
	
    }
    void sample5() {
    	System.out.println("Akash class sample5");
	
    }
	
}

class UseAll{
	
	void useme(Krishnaa kr) {
		kr.sample1();
		kr.sample2();		
	}
	void useme1(Karthik k) {
		k.sample1();
		k.sample2();
		k.sample3();
		k.sample4();
	}
	void useme2(Akash a) {
		a.sample1();
		a.sample2();
		a.sample3();
		a.sample4();
		a.sample5();
	}
	
	
		
	}


public class Learninheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	Krishnaa kr = new Krishnaa();
		kr.sample1();
		kr.sample2();
		System.out.println("*********");
		Karthik kk = new Karthik();
		kk.sample1();
		kk.sample2();
		kk.sample3();
		kk.sample4();
		System.out.println("***********");
		Akash a = new Akash();
		a.sample1();
		a.sample2();
		a.sample3();
		a.sample3();
		a.sample4();
		a.sample5();
		System.out.println(a.getClass());*/
		System.out.println("*************");
		
		UseAll ua = new UseAll();
		ua.useme(new Krishnaa());
		ua.useme1(new Karthik());
		ua.useme2(new Akash());
		Krishnaa kr = new Krishnaa();
		System.out.println(kr);
		 
		
		

	}

}
