package exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;

class TestExceptionPropagation2{  
	void m() throws IOException,FileNotFoundException{  
		throw new java.io.IOException("device error");//checked exception  
	}  
	void n() throws IOException{  
		m();  
	}  
	void p(){  
		 
				try {
					n();
				} catch (IOException e) {
					e.printStackTrace();
				}
			  
	}  
	public static void main(String args[]){  
		TestExceptionPropagation2 obj=new TestExceptionPropagation2();  
		obj.p();  
		System.out.println("normal flow");  
	}  
} 