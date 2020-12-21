package Accaunt19;

public class CheckingAccount19 extends Account19 {
	private double overDraftLimit;
	
	CheckingAccount19(int id, double balance, double overDraft) {
		super(id, balance);
	}
	
	public void withdraw(double a) {
		if(balance + overDraftLimit>=a) {
			balance-=a;
		}
	}
	
	public String toString() {
		return super.toString() + " Checking Account";
	}
	
	public double getOverDraftLimit() {
		return overDraftLimit;
	}

	public void setOverDraftLimit(double overDraftLimit) {
		this.overDraftLimit = overDraftLimit;
	}
}