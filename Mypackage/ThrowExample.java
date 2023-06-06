package Mypackage;
public class ThrowExample {
	public static void validate(int age) {
		if(age<18) {
			throw new ArithmeticException("Not elligible to vote");
		}		
//throw syntax - throw new exception_name ("customized exception message");
		else {
			System.out.println("go and vote");
		}
	}
	public static void main(String[] args) {
		validate(22);
		System.out.println("remaining statements...");	
	}
}


