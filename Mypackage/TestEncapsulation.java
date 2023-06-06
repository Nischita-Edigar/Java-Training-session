package Mypackage;
//Encapsulation --- process of wrapping code and the data members together
class Account{
	private long acc_no;
	private String name;
	private float amount;	
	

//public long getAcc_no() {
//	return acc_no;
//}
//public void setAcc_no(long acc_no) {
//	this.acc_no = acc_no;
//}
//public String getName() {
//	return name;
//}
//public void setName(String name) {
//	this.name = name;
//}
//public float getAmount() {
//	return amount;
//}
//public void setAmount(float amount) {
//	this.amount= amount;
//}
//}
public long getAcc_no() {
		return acc_no;
	}


	public void setAcc_no(long acc_no) {
		this.acc_no = acc_no;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public float getAmount() {
		return amount;
	}


	public void setAmount(float amount) {
		this.amount = amount;
	}


public class TestEncapsulation {

	public static void main(String[] args) {
		Account acc = new Account();
		acc.setAcc_no(2766878788787L);
		acc.setName("ABC");
		acc.setAmount(500000f);
		System.out.println(acc.getAcc_no() + " "+ acc.getName() + " "+acc.getAmount());
	}

}

