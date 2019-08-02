package JavaInterface;
interface Act1{
	void acting1();
}

interface Act2{
	void acting2();
}
 class Testing1 implements Act1,Act2{
	 
	 public void acting1() {
		 System.out.println("Running Acting1 method");
	 }
	 
	 public void acting2() {
		 System.out.println("Running Acting2 method");
	 }
 }
public class Interfacerun2 {
	public static void main(String[] args) {
		System.out.println("Starts");
		Testing1 t1 = new Testing1();
		t1.acting1();
		t1.acting2();
		System.out.println("Ends");
	}

}


// Sub class inheriting the the interface should implement all the abstract method of interface, other wise sub class should be
//abstract  , A Sub class inherit more than one interface, in such case the sub class should inherit all the abstract method

// A Class can inherit form both class and interface. If the super class is abstract then sub class should override the 
// both abstarct class and interface.

// An abstract class as well as the interface defines the contract between subclass and super type , the contract is sub class 
// can exist only if it overrides the abstract method of the abstract and interface.