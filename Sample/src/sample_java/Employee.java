package sample_java;

public class Employee {
	
	int empid;
	String empname;
	int salary;
	int deptno;
	
	 Employee(int id,String name, int sal,int dno)
	 
	 {
		 empid=id;
		 empname=name;
		 salary=sal;
		 deptno=dno;	 
	 }
	
	
	
	
	void display()
	{
		System.out.println(empid);
		System.out.println(empname);
		System.out.println(salary);
		System.out.println(deptno);
			
	}
	
	public static  void main(String args[])
	{
		
	/*Employee emp1= new Employee();
	emp1.empid=101;
	emp1.empname="vashant";
	emp1.salary=20000;
	emp1.deptno=1;
	emp1.display();
	
	
	Employee emp2=new Employee ();
	
	emp2.empid=102;
	emp2.empname="Rajesh";
	emp2.salary=30000;
	emp2.deptno=2;
	emp2.display();*/
		
		Employee emp1=new Employee(101,"Vashant",20000,1);
		
		emp1.display();
			
		}
		
	

	
}
