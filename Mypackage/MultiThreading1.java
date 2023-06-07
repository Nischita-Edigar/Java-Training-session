package Mypackage;
//By implementing runnable interface
public class MultiThreading1 implements Runnable {
	public void run() {
		System.out.println("Thread is Running...!!!");
	}

	public static void main(String[] args) {
		MultiThreading1 mt1 = new MultiThreading1();
		Thread th = new Thread(mt1);//using  constructor of Thread class
		th.start();  
		// th.start(); throws exception -- illegalthreadstateexception
		//setting the name of a thread
		th.setName("abc");
		System.out.println(th.getName());
	}
}
//THREAD-0, THREAD-1, THREAD-2
 //

//built in constructors in thread class --- Thread(), Thread(String name), Thread(Runnable r)
//Thread(Runnable r String name)
