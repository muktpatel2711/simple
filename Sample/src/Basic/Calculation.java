package Basic;

public class Calculation {

	static void printMessage()
	{
		
		System.out.print("welcome to java");
		
	}
	
	
	// -----------
	
	
	public void sum(int a, int b) {
		
		System.out.print(a+b);
		
	}
	
	
	public static void main(String[] args) {
		
		Calculation ob= new Calculation();
		ob.sum(2, 3);
		
 
		printMessage();
		
		
		
		

	}

}
