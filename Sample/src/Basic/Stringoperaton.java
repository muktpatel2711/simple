package Basic;

public class Stringoperaton {

	public static void main(String[] args) {
		
		
		String s= "BAPS";
		
		//String Methods 
		System.out.println(s.charAt(3));
		
		// String lenght
		
		System.out.println(s.length());
		
		// tolowercase
		
		System.out.println(s.toLowerCase());
		
		//touppercase
		
		System.out.println(s.toUpperCase());
	
		// replacement 
		
		System.out.println(s.replace('S', 'A'));
		
		// replacement whole string
		
		System.out.println(s.replace("BAPS", "BAPA"));

		//indexof
		
		System.out.println(s.indent('S'));
		
		//empty
		
		System.out.println(s.isEmpty());
	}

}
