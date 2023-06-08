package javaPrograms;
import java.util.*;

public class LinkedListExample {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(10);
		list.add(3);
		list.add(0);
		list.add(19);
		list.add(1);
		Iterator<Integer> itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		Collections.sort(list);
		System.out.println(list);	
	}
}

//vectors --- mainly used for thread safe implementation.
//stack -- pop, push 

