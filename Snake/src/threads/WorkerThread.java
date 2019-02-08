package threads;
import java.util.concurrent.ExecutorService;  
import java.util.concurrent.Executors;  
class WorkerThread implements Runnable {  
	private String message;  
	public WorkerThread(String s){  
		this.message=s;  
	}  
	public void run() {  
		System.out.println(Thread.currentThread().getName()+" (Start) job-no = "+message);  
		processmessage();//call processmessage method that sleeps the thread for 2 seconds  
		System.out.println(Thread.currentThread().getName()+" (End)-jobno"+message);//prints thread name  
	}  
	private void processmessage() {  
		try {  Thread.sleep(2000);  } catch (InterruptedException e) { e.printStackTrace(); }  
	}  
}  