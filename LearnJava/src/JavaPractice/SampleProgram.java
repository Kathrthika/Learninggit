package JavaPractice;

class Sample
{
static int i = 10;
int j = 20;
double d = 1.1;

}
class Sample1{
static int k = 35;
float l = 20.00f;
double m = 10.5;
}



public class SampleProgram {

public static void main(String[] args) {
	
	System.out.println("program Starts new");
	Sample s = new Sample();
	Sample1 s1 = new Sample1();
	System.out.println("i = "+s.i);
	System.out.println("j "+s.j);
	System.out.println("d "+s.d);
	System.out.println("k "+s1.k);
	System.out.println("l = "+s1.l);
	System.out.println("M = "+s1.m);
	System.out.println("Program Ends");	
	
}}