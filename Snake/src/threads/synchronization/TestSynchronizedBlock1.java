package threads.synchronization;
class Table{  

	void printTable(int n){  
		System.out.println("these first 10 instructions need not be synchronized"+Thread.currentThread().getName());
		synchronized(this){//synchronized block  
			for(int i=1;i<=5;i++){  
				System.out.println(n*i);  
				try{  
					Thread.sleep(400);  
				}catch(Exception e){System.out.println(e);}  
			}  
		}  
		System.out.println("these last 10 instructions also need not be synchronized");
	}//end of the method  
}  

class MyThread1 extends Thread{  
	Table t;  
	MyThread1(Table t, String string){  
		this.t=t;  
		Thread.currentThread().setName(string);
	}  
	public void run(){  
		t.printTable(5);  
	}  

}  
class MyThread2 extends Thread{  
	Table t;  
	MyThread2(Table t, String string){  
		this.t=t;  
		Thread.currentThread().setName(string);
	}  
	public void run(){  
		t.printTable(100);  
	}  
}  

public class TestSynchronizedBlock1{  
	public static void main(String args[]){  
		Table obj = new Table();//only one object  
		MyThread1 t1=new MyThread1(obj,"one");  
		MyThread2 t2=new MyThread2(obj,"two");  
		t1.start();  
		t2.start();  
	}  
}  