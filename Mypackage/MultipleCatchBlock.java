package Mypackage;

public class MultipleCatchBlock {

	public static void main(String[] args) {
		try {
			int a[] = new int[5];  //arrayindex
			a[10] = 40;
			int num = 10/0; // arithmetic

			
		}
		catch (ArithmeticException e) {
			System.out.println("this is an arithmetic exception");
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("this is an ArrayIndexOutOfBounds exception");
		}
		System.out.println("multiple catch block");
	}

}
