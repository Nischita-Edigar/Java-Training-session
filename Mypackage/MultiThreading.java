//by extending thread class
package Mypackage;
public class MultiThreading extends Thread {
	public void run() {
		System.out.println("Thread is running.....!!!");
	}
	public static void main(String[] args) {
		MultiThreading mt = new MultiThreading();
		mt.start();
	}
}

