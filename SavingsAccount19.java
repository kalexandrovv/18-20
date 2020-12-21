package Accaunt19;

public class SavingsAccount19 extends Account19 {
	
	public SavingsAccount19(int id, double balance) {
		super(id, balance);
	}
	
	public void withdraw(double a) {
		if(balance>=a) {
			balance-=a;
		}
	}
	
	public String toString() {
		return super.toString() + " Savings Account";
	}
}