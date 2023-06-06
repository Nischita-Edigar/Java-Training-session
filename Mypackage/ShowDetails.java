package Mypackage;

abstract class Student{
	abstract int getStudentMarks();
}

class Student1 extends Student{
	int getStudentMarks() {
		return 50;
	}
	
}
class Student2 extends Student{
	int getStudentMarks() {
		return 60;
	}
	
}
public class ShowDetails {

	public static void main(String[] args) {
		Student s;
		s= new Student1();

		System.out.println("marks" + s.getStudentMarks());
		
	}

}
