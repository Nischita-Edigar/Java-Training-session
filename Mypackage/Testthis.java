package Mypackage;

class Employee{
	int empno;
	String name;
	float salary;
	Employee(int empno, String name, float salary){
		this.empno=empno;
		this.name=name;
		this.salary=salary;	
	}
	void display() {
		System.out.println(empno + " " + name + " " + salary);
	}
}

public class Testthis {

	public static void main(String[] args) {
		Employee e1 = new Employee(2334, "Nischita" , 50000);
		    e1.display();	

	}

}




//reusable, retaine, readable



//syntax of inheritance
// class subclass_name extends super_calss{
//-------
//}
