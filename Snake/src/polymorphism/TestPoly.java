/**
 * 
 */
package polymorphism;

/**
 * @author Admin
 *
 */
public class TestPoly {
	
	public static void main(String[] args) {
		Father mfather; ///reference variable
		mfather = new Son();//object is created at the runtime.. so the son's eat method is called
		mfather.eat(); ///runtime binding
	}

}
