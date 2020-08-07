package SampleJavaCodes;

public class Method_OverLoad {
	
	

	public void print (int num) {
		
		System.out.println("This is the 1st print...."+num);
		
	}
	
	
	public void print (double num ) {
		System.out.println("This is the 2nd print...."+num);
	}
	
		
	

      public static void main(String[] args) {

    	  Method_OverLoad MO= new Method_OverLoad ();
    	  
    	  MO.print(10);
    	  MO.print(5.3);




}}