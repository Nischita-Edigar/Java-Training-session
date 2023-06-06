package Mypackage;
//example arithmetic exception
public class ExceptionExample {

	public static void main(String[] args) {
		try {
			//int a = 10/0;	
//			String s = null;
//			System.out.println(s.length());
			int a[] = new int [3];
			a[5] = 20;
		}
//		catch (ArithmeticException a) {
//			System.out.println(a);
//		}
		//an example for nullpointerexception
//		catch(NullPointerException n) {
//			System.out.println(n);
//		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);			
		}
		//rest of the code
	System.out.println("exception handled successfully");

}
}

//catch(exception_name reference){}


//exception
//statement 1
//statement 2
//statement 3   // exception
//statement 4
//statement 5

