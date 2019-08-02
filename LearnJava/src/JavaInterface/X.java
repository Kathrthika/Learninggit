package JavaInterface;



 class X {
	
	void test1() {
	 System.out.println(" X test1()");
		}
	void commontest1() {
		 System.out.println(" common test1()");
			}
		
	

}
 
class Y extends X{
	
  void test1() {
		
		System.out.println("Y test1()");
	
	}
  void test2() {
		
		System.out.println("Y test1()");
	
	}
  void ytest2() {
		
		System.out.println("Ytest2()");
	
	}
	
}

class Z extends Y{
	void  test1() {
		System.out.println(" Z test1()");
	
	}
void test2() {
		
		System.out.println("Z test2()");
	
	}
void test3() {
	
	System.out.println("Z test3()");

}

	
}

class XX{
	void sample(X a) {
		 a.test1();
		 a.commontest1();
		 
		 
			
		System.out.println("Printing sample KK value :");
	}
	void sample1(Y b) {
		 b.test1();	
		 b.test2();	
		 b.commontest1();
		
	}
	void sample2(Z c) {
		 c.test1();	
		 c.test2();	
		 c.test3();
		 c.commontest1();
		 c.ytest2();
		
	}
	
	
	
	
}
