package JavaPractice;



class ModelA{
	void modela(){
		System.out.println("Class ModelA method ");
		
	}
	void modelab(){
		System.out.println("Class ModelA methodab");
		
	}
	}
	
	class ModelB extends ModelA{
		void modela() {
			System.out.println("Class ModelB method ");
			
		}
		void modelb() {
			System.out.println("Class ModelB methodb ");
			
		}
	}
	


public class Methodoverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Program Starts");
		ModelB mb = new ModelB();
		mb.modela();
		mb.modelb();
		mb.modelab();

	}

}
