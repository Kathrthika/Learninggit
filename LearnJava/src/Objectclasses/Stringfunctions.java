package Objectclasses;

public class Stringfunctions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "Karthik";
		System.out.println("s "+s);
		System.out.println("string Length"+s.length());
		System.out.println("string char at 4"+s.charAt(4));
		System.out.println("index of e "+s.indexOf('e'));
		System.out.println("last index of e "+s.lastIndexOf('e'));
		System.out.println("Contains "+s.contains("dev"));
		System.out.println("Startts "+s.startsWith("pid"));
		System.out.println("Ends with "+s.endsWith("der"));
		System.out.println("s is empty"+s.isEmpty());
		System.out.println("substring "+s.substring(4));
		System.out.println("substring "+s.substring(0,2));
		System.out.println("substring "+s.toLowerCase());
		System.out.println("substring "+s.toUpperCase());
		

	}

}
