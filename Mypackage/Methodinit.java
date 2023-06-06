package Mypackage;
class InitMethod{
	int num;
	String city;
	void insertData(int n, String c) {
		num = n;
		city = c;
	}
	void ShowData() {
		System.out.print(num + " " + city);
	}
}
public class Methodinit {
	public static void main(String[] args) {
		InitMethod In = new InitMethod();
	//	InitMethod In1 = new InitMethod();
		In.insertData(111, "Bangalore");
	//	In1.insertData(11, "Hyderabad");
		In.ShowData();
	//	In1.ShowData();	
	}
}

// Different ways to create a object
//1.new
//2. newInstance()
//3. By clone()
//by deserialization


//hello good morning  == > ABC@GMAIL.COM


//01010101010101010101010 ==== >> internal mechanism  //security


//ABC@GMAIL.COM ====== > hello good morning


//creating multiple onjects


//int a= 10, b= 20;

// object1 o1 = new object1(),  object2 o2 = new object2();



// rules to create a constructor 

// class name , constructor name should be same
// abstract, static, final 



//class Name{     ======= >   class Name{
                    //              Name() {    
	
//}                                      }}



/// Name n = new Name("abc")

// methods of an object

// equals()
//hashcode()
//toString()
//getClass()
//clone()
//finalize()
//notify()
//notifyAll()
//wait()
//getClassLoader()


//static keyword


//int num = 768798989;
//String name = "ahjgdh";
//static  String company_name = "indiqsoft";
// it loads at the time of class loading.






