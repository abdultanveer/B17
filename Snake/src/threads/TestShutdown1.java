package threads;
class SangShutDownHookThread extends Thread{  
	public void run(){  
		System.out.println("perform all the tasks that dg has told before closing office");  
	}  
}  

public class TestShutdown1{  
	public static void main(String[] args)throws Exception {  

		Runtime office = Runtime.getRuntime();  
		office.addShutdownHook(new SangShutDownHookThread());  

		System.out.println("Now main sleeping... press ctrl+c to exit");  
		try{Thread.sleep(3000);}catch (Exception e) {}  
	}  
}