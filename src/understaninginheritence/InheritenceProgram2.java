package understaninginheritence;

public class InheritenceProgram2 {

	public static void main(String[] args) {
		
		Baba B=new Baba();
		
		B.Computer= 2;
		B.Display();
		B.Land= "Land";
		
		
		myself Fatema=new myself();
		
		Fatema.Job= "teaching";
		Fatema.Books= 100;
		System.out.println("\nAccessing myselfClass variables:");
		System.out.println("Fatema has a job of " + Fatema.Job);
		System.out.println("No. of Fatema's book: "+ Fatema.Books); 
		
		Fatema.Computer= 2;
		System.out.println("\nAccessing Baba-Class variables and method:");
		System.out.println("No. of computers Fatema inherited from Baba: "+ Fatema.Computer);
	
		Fatema.Work();
		Fatema.Display();
		System.out.println("\nAccessing Dada-Class variables and method:");
		
		Fatema.Land= "Land";
		Fatema.Trees= 400;
		System.out.println("Fatema's inherited money:" + Fatema.Bankmoney);
		System.out.println("No. of Fatema's inheried trees:"+ Fatema.Trees);
	    System.out.println("Fatema also inheried Baba's " + Fatema.Land);
		Fatema.sell();
	
		


	}

}

class Dada {

	private String Home;
	protected String Land;
	public int Trees;
	int Bankmoney= 10000;

	void sell() {
		System.out.println("Sell value of home is good!");
	}
}


class Baba extends Dada {

	private int money;
	protected int Computer;
	public int cash;
	int shop;


	void Display() {
		System.out.println("Baba like Computer Science");

	}
	void Work() {

	}
}
	class myself extends Baba{
		
		int Books;
		String Job;
			
		
	}	

