package sample_java;

public class calculation {
	
	int a;
	int b;
	
	
	//1) method may not parameters -empty parameters
	/*void sum()
	{
		System.out.print(a+b);
		
	}*/
	
	
	//2) method takes parameters
	void sum(int x,int y)
	
	{
		a=x;
		b=y;
		System.out.print(a+b);
		
		
	}

	public static void main(String[] args)
	{
		calculation cal=new calculation();
		/*cal.a=50;
		cal.b=50;
		cal.sum();*/
		
		cal.sum(50, 50);
		
		
		
		
	}
	
	
	
	
	
}
