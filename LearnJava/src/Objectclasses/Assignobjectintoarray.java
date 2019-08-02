package Objectclasses;

class Tree{
	void sampletest1() {
		System.out.println("printing sampletest1 method");
	}
	
}
class Wood extends Tree{
	
}
class Tables extends Wood{
	
}

public class Assignobjectintoarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tree[] t1 = new Tree[4];
		t1[0]=new Tree();
		t1[1]= new Wood();
		t1[2]= new Tables();
		
		for (Tree t : t1) {
			System.out.println("Array elements "+t);
		}
		t1[0].sampletest1();
		
		//Array initialization
		int[] a1 = {11,12,13,14};
		

	}

}
