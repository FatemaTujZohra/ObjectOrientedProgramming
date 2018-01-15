package understaninginheritence;



public class InheritenceProgram1 {

	
public static void main(String[] args) {
	
	
	CreditCardsLutfor CF= new  CreditCardsLutfor (); //Declaring base-class object
	CF.BankOfAmerica= 1000;
	CF.BestBuy= 2000;
	CF.WellsFargo= 500;
	
	System.out.println("Accessing Base-Class variables:"); 
	System.out.println("Credit limit in Bank of America Card: "+ CF.BankOfAmerica);
	System.out.println("Credit limit in Best Buy Card:" + CF.BestBuy);
	
	Uzma u=new Uzma();// Declaring derived-class object
	u.BankOfAmerica= 100;
	u.BestBuy=200;
	u.WellsFargo= 20;
	System.out.println("\nAccessing Base-Class variables by Derived-Class:");
	System.out.println("Uzma Credit limit in Bank of America Card: "+ u.BankOfAmerica);
	System.out.println("Uzma Credit limit in Best Buy Card:" + u.BestBuy);
	
	u.Name= "Uzma";
	u.Books= 25;
	System.out.println("\nAccessing Derived-Class variables by Derived-Class:");
	System.out.println("Name of Uzma: "+ u.Name);
	System.out.println("The number of fiction books of Uzma: "+ u.Books);
	
	
	System.out.println("\nAccessing Base-Class Methods by Derived-Class:");
	u.Display();
	u.SetData();
	
	System.out.println("\nAccessing Derived-Class Methods by Derived-Class:");
	u.Reading();
	
	
	
}


	

}

 class CreditCardsLutfor{
	
	int BankOfAmerica;
	int BestBuy;
	int WellsFargo;
    String Name;
    
   void SetData () {
	   System.out.println(" I love uzma");
	   
   }
   
   void Display () {
	   System.out.println(" Uzma is great");
	
}
} 

   class Uzma extends CreditCardsLutfor{
	   String Name;
	   int Books;
	  void  Reading(){
	System.out.println(" Reading is good");

	   
   }

   }
