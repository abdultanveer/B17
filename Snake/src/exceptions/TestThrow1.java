package exceptions;
public class TestThrow1{  
	static void validate(int age){  
		if(age<18)  
			//throw is making a call
			throw new ArithmeticException("not valid");  
		else  
			System.out.println("welcome to vote");  
	}  
	public static void main(String args[]){  
		try {
			validate(13);
		} catch (Exception e) {
			System.out.println("call accepted");
			}  
		System.out.println("rest of the code...");  
	}  
}  