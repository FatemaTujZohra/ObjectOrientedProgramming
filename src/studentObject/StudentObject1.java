package studentObject;



public class StudentObject1 {

	public static void main(String[] args) {
		Student S= new Student ();
		//S.Roll= 101;
		//S.Mark= 70.6F;

	}

}


class Student {
	int Roll;
	String Name;
	float Mark ;
	Student(){
	    Roll= 101;
		Name = "Fatema";
		Mark= 70.6F ;
		System.out.println("Roll is: "+ Roll );
		System.out.println("Name is : " +Name);
		System.out.println("Mark is : " +Mark);

	}

}
