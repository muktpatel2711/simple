package Basic;

public class studentclass {
	
	
	String name;

	int roll;
	
	static String college="BMW";
	
	public static void main(String[] args) {
		studentclass std1= new studentclass();
		std1.name="amit";
		std1.roll=1;
		System.out.println(std1.name+ "," +std1.roll+ "," +std1.college);
		
		studentclass std2= new studentclass();
		std2.name="mahesh";
		std2.roll=2;
		System.out.println(std2.name+ "," +std2.roll+ "," +std2.college);
	}

}
