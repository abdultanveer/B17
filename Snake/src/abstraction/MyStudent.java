package abstraction;

public class MyStudent implements IStudent{

	@Override
	public void askQuestion() {
		System.out.println("asking question");
		
	}

	@Override
	public void answerQuestion() {
		System.out.println("answering question");
		
	}
	
	/*public void askQuestion() {
	}
	
	public void answerQuestion() {
	}*/

}
