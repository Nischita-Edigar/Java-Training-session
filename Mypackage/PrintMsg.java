package Mypackage;

public interface PrintMsg {
	void print();
}

interface printmsg1 extends PrintMsg{
	void print1();
}
class Message implements printmsg1{
	public void print() {
		System.out.println("for print method");
	}
	public void print1() {
		System.out.println("for print1 method");
	}
	public static void main(String args[] ){
		Message obj = new Message();
		obj.print();
		obj.print1();
		
	}
}

//ABSTRACTION
// class Message implements PrintMsg {
//	public void show() {
//		System.out.println("hello coders");
//		
//	}
//	public static void main(String args[]) {
//		Message obj = new Message();
//		obj.show();
//	}
//}
