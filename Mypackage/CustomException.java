package Mypackage;
//  Rules to create custom exception 
//1. class should extends with exception
//2. calling constructor of parent exception using super keyword
//3.create class that uses above exception
//4. throw an object
//5. print the required statements
class MyException extends Exception {
	public MyException(String S) {
		super(S);
	}
}
public class CustomException {
	public static void main(String[] args) {
		 try {
			 throw new MyException("This is customized exception");
		 }
		 catch(MyException me) {
			 System.out.println("Exception handled");
			 System.out.println(me.getMessage());
		 }
	}
}
