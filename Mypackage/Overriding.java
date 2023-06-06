package Mypackage;
//Runtime polymorphism=dynamic binding -- method overriding
class Hellocoders{
	void method1() {
		System.out.println("Method from parent class");
	}
}

public class Overriding extends Hellocoders {
	void method1() {
		System.out.println("method from sub class");
	}
	public static void main(String[] args) {
		Hellocoders obj = new Hellocoders();
		obj.method1();
		
	}

}
