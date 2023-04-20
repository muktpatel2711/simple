package Basic;

 class Student {
	 
	 String name;
	 int age;
	 
	 
	 public void printinfo() {
		 
		 System.out.println(this.name);
		 System.out.println(this.age);
		 
		 }
	 
	 Student (String name, int age) {
		 
		 this.name =name;
		 this.age = age;
		 
		 
		 
	 }
	 
	  
	 
	 
	
	 
	 public class ppps{
		 
		 public static void main (String args[]) {
			 
			 Student s1=new Student("aman", 80);
			 s1.printinfo();
			 
			 
		
					 
			 }
		 
		 
		 
		 
	 }
	

}
