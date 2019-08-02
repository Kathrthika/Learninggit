package JavaPractice;

class G{
	private static G g1=null;
	private G() {
		System.out.println("Running G Constructor");
	}
	
	public static G getinstance() {
		if(g1==null) {
			System.out.println("Creating a instance of G");
			g1= new G();
					}
		return g1;
	}
	void sample1() {
		System.out.println("Running Sample1 of G class");
	}
}

public class SingletonClass {
	public static void main(String[] args) {
		G g2 = G.getinstance();
		g2.sample1();
	}

}
