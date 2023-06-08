package javaPrograms;
import java.util.ArrayList;
import java.util.Collections;
public class ArrayListExample1 {
	public static void main(String[] args) {
//		ArrayList<String> al = new ArrayList<String>();
//		al.add("Java");
//		al.add("Abc");
//		al.add("Ruby");
//		al.add("Python");
//		al.add("Java");
//		
//		Collections.sort(al);
//		System.out.println(al);
//		
//		//for iterating elements
//	for(String language : al) {
//		System.out.println(language);
////
////			
//		}
		ArrayList<Object> al = new ArrayList<Object>();
		al.add(1);
	al.add("Abc");
	al.add("Ruby");
	al.add("Python");
	al.add(2.0);
	al.remove(1);
	System.out.println(al);


	}
}


//searching and sorting
