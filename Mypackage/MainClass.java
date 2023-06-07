package Mypackage;

class MyException extends Exception {
	public MyException(String s){
        super(s);
    }
}
public class MainClass{
    public static void main(String args[]){
        try{
            throw new MyException("Exception");
        }
        catch(MyException ex){
            System.out.println("caught exception");
            System.out.println(ex.getMessage());
        }
    }
}

