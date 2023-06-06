package Mypackage;

public class ArrayExample {

	public static void main(String[] args) {
		// single dimensional array
		int arr[] = {1,2,3,4,5};
//		for(int i = 0; i<arr.length;i++) {
//			System.out.println("the given array is" + " " + arr[i]);
//		}  -- using for loop
		for(int i : arr) {
			System.out.println(i);
		}
			
		//multi dimensional array 
		//int [] [] arr = new int[3][3];

	}

}
