package sample_java;

public class obj {
	
		int rollno;
		String name;
		
		
		 void display() {
			
			System.out.print(name);
			System.out.print(rollno);
			
		}
		
		public static void main () {
			
			obj student1= new obj();
			
			student1.name= "akash";
			student1.rollno=101;
			student1.display();
			
		}

	

}
