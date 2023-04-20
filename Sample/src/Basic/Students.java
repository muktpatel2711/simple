package Basic;

public class Students {
	
	
	int rollno;
	String name;
	
	
	public void display() {
		
		System.out.print(name);
		System.out.print(rollno);
		
	}
	
	public static void main () {
		
		Students student1= new Students();
		
		student1.name= "akash";
		student1.rollno=101;
		student1.display();
		
	}

}
