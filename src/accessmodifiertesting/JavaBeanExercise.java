package accessmodifiertesting;

public class JavaBeanExercise {

	public static void main(String[] args) {
		CreditCard C= new CreditCard ();
		C.setName("Fatema Tuj Zohra");
		System.out.println(C.getName());
		C.setID(123456);
		System.out.println(C.getID());
		
		
		

	}

}

 class CreditCard {
	  
	  private int ID;
	  private String Name;
	  public CreditCard() {
	
}
	 
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
 
 }
 
 
 
