package Objectclasses;

public class StringBuff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = new String("Karthik");
		String s2 = new String("Karthik");
		
		StringBuffer sb1 = new StringBuffer("Karthik");
		StringBuffer sb2 = new StringBuffer("Karthik");
		
		System.out.println(s1.equals(s2));
		System.out.println(sb1.equals(sb2));
		
		System.out.println(s1==s2);
		System.out.println(sb1==sb2);
		
		
		System.out.println(s1.toString());

	}

}
