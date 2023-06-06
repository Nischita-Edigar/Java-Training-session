package Mypackage;
//polymorphism -- is a process by which we can perform a single action in multiple ways
//two types of polymorsphism -- compile time=static binding, Runtime = dynamic binding

//An example for compile time polymorphism  -- method overloading

class Summation{
	static int add(int a, int b) {
		return a + b;
	}
	static double add(int a, int b, int c) {
		return a + b + c;
	}
}

public class Overloading {

	public static void main(String[] args) {
		System.out.println(Summation.add(1, 2));
		System.out.println(Summation.add(1, 2, 3));

	}

}
