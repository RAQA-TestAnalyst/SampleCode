package SampleJavaCodes;

public class Inheritance_Makeup {
	
	    String brand= "Mac";

		public void product() {

		System.out.println("Red blush from "+ brand);


		}


		 static class cosmetics extends Inheritance_Makeup {

		 static String item = "Blush";

		 

		public static void main(String[] args) {

		cosmetics cos= new cosmetics();

		cos.product();


		System.out.println("The Makeup product is a " + item);
		}
		}
		}
	
	
	




