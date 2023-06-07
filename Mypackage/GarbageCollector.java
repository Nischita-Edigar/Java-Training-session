package Mypackage;

public class GarbageCollector {
	public void finalize() {
		System.out.println("object is garbage collected");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GarbageCollector gc =new GarbageCollector();
		gc = null;
		System.gc();
		

	}

}
