import threads.MyThreadsSync;

public class Test {
	public static void main(String[] args) {
		
		/*MyThreadsSync myThreadsSync;
		threads.sync.MyThreadSync myThreadSync1;
		myThreadsSync = new MyThreadsSync();
		myThreadSync1 = new threads.sync.MyThreadSync();
		*/
		/*IncomeTax incomeTax;
		incomeTax = new GST();
		incomeTax.salary = 1000000;
		System.out.println("the tax for 2019 =" +incomeTax.calculateTax());*/
		
		
		
		/*Snake snake = new Snake();
		snake.eat("eggs");
		snake.move(5);*/
		
		Student abdul;   ///declaration --- in table of contents-- without pg no
		abdul = new Student("ansari");   //instantiation ---creating the chapter
		//abdul.name = "";
		//abdul.setName("ansari");
		//abdul.name = "ansari";   //initialization
		
		System.out.println("name of student =" + abdul.getName());
		abdul = null;
		System.gc();
		//abdul.name);
		//System.out.println("COLLEGE NAME = "+Student.COLLEGE_NAME);
		
	}

}
