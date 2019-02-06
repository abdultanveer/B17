package exceptions;

public class ExceptionHandling {
	
	public static void main(String[] args) {
		
		try {
			//hey dong what if you don't get the medicine
			int a = 10/0;
			//dong will call on mobile and give the exceptionObject msg
		} catch (Exception exceptionObject) {
			//call is received
			//exceptionObject.printStackTrace();
			
			System.out.println(exceptionObject.getMessage());
		}
		
		System.out.println("code after exception");
	}

}
