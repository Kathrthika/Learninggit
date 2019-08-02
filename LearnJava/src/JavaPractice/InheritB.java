package JavaPractice;
class Test1{
	Test1(){
		System.out.println("Running test1 Cons");
	}}
class Test2 extends Test1{
	Test2(double b){
		super();
		System.out.println("Running test2 Cons");
	}}
class Test3 extends Test2{
	Test3(){
		super(0);
		System.out.println("Running test3 Cons");
	}}
public class InheritB {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("**********");
		Test3 t = new Test3();
		System.out.println("**********");

	}}
