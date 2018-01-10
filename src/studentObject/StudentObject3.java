package studentObject;


public class StudentObject3 {

	public static void main(String[] args) {
		NaughtyStudent NS1= new NaughtyStudent();
		NaughtyStudent NS2 = new NaughtyStudent();
		NaughtyStudent NS3 = new NaughtyStudent();

		NS1.setData(50, 33, "Karim");
		NS2.setData(51, 30, "Rahim");
		NS3.setData(52, 34, "Jabbar");

		NS1.Display();
		System.out.println();
		NS2.Display();



	}


}
class NaughtyStudent{

	public int Roll;
	protected int Mark;
	private String Name;

	void setData (int Roll, int Mark, String Name) {
		this.Roll= Roll;
		this.Mark= Mark;
		this.Name= Name;
	}
	void Display( ) {

		System.out.println("Roll is: "+ Roll);
		System.out.println("Mark is: "+ Mark);
		System.out.println("Name is: "+ Name);







	}	

}

