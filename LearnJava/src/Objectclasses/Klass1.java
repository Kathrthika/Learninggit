package Objectclasses;
class AAA{
AAA(){

	}
	
	
}
public class Klass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AAA a = new AAA();
		System.out.println(a.toString());
        AAA b = new AAA();
        		System.out.println(b.toString());
        		
        		String str1 = new String("Karthik");
        		
        		System.out.println("str1="+str1);
        		System.out.println("str1 hascode"+str1.hashCode());

        		String str2 = new String("Karthik");
        		System.out.println("str2 hascode"+str2.hashCode());
        		String str3 = new String("Karthik1");
        		
        		System.out.println("str2="+str2);
        		System.out.println("*********");
        		System.out.println("Compare Str1 and str2");
        		System.out.println(str1==str2);
        		System.out.println();
        		System.out.println("Equals");
        		System.out.println(str1.equals(str2));
        		
        		// String is immutable object, Once a String Object is created we can
        		// not change the Object Value. if we change the object value, it will create
        		// new object instead of changing other one.
        		
        		String s1 = "developer";
        		String s2 = "developer";
        		String s3 = "developer";
        		String s4 = "testing";
        		
        		System.out.println("s1 "+s1);
        		System.out.println("s2 "+s2);
        		System.out.println("s3 "+s3);
        		System.out.println("s4 "+s4);
        		
        		s2 = "tester";
        		s4 = "tested";
        		System.out.println("s1 "+s1);
        		System.out.println("s2 "+s2);
        		System.out.println("s3 "+s3);
        		System.out.println("s4 "+s4);
        		
        		
        		
        		
	}
	}

