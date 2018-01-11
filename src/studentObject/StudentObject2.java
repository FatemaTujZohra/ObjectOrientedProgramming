package studentObject;// this is a small program showing how you can assign value to certain
//variables of a class from another class. you can do this from another public class and under the public 
//static void method. all you do is declare a object of that class and use dot after the object
//name and asign the value


public class StudentObject2 {

	public static void main(String[] args) {
		
		GoodStudent GS= new GoodStudent();
		GS.Name= "Uzma";
		GS.Roll=1;
		GS.Mark= 100.2f;
		
		
	
		
		
		//GS.Display();
	
		System.out.println("Roll is: " + GS.Name);
		System.out.println("Roll is: " + GS.Roll);
		System.out.println("Roll is: " + GS.Mark);


	}

}


class  GoodStudent {
	
	int Roll;
	float Mark;
	String Name;
	
	//void Display() {
	

	
	
	
		
		//this.Roll= Roll;//this line has no effect and why
		//System.out.println("Roll is: " + Roll);// this line has no effect and why


		
			
}


