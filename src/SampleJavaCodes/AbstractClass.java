package SampleJavaCodes;



//Example of abstract class and method


public abstract class AbstractClass {
	
	 public abstract void BirdSound();
	 
	  public void sleep() {
	    System.out.println("Zzz");
	  }
	}

	
	class Bird extends AbstractClass {
	 
		public void BirdSound() {
	    
	    System.out.println("The Bird Chirping");
	  }
	}

	class MyMainClass {
		public static void main(String[] args){
	    
		  Bird cardinal  = new Bird(); 
	    cardinal.BirdSound();
	    cardinal.sleep();
	  }
	}
