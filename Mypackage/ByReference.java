package Mypackage;

class Intialzeobj {
	String language;
}

public class ByReference {
	public static void main(String[] args) {
		
		Intialzeobj obj1 = new Intialzeobj();
		obj1.language = "java";
		System.out.println(obj1.language);		

	}

}
