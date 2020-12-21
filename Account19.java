package Accaunt19;

import java.util.Date;

public class Account19 {
	private int id=0;
	protected double balance=0;
	public static double yearInterestRate=0;
	private Date dateCreated=new Date();
	Account19(){
		
	}
	Account19(int newId, double newBalance){
		id = newId;
		balance = newBalance;
	}
	Account19(int newId, double newBalance, double newYearInterestRate){
		id = newId;
		balance = newBalance;
		yearInterestRate=newYearInterestRate;
	}
	String dateCreated() {
		return dateCreated.toString();
	}
	void setID(int newID) {
		id=newID;
	}
	void setBalance(int newBalance) {
		balance=newBalance;
	}
	static void setYearInterestRate(int newYearInterstRate) {
		yearInterestRate=newYearInterstRate;
	}
	int getID() {
		return id;
	}
	double getBalance() {
		return this.balance;
	}
	double getYearInterestRate() {
		return yearInterestRate;
	}
	double getMonthlyInterestRate() {
		return yearInterestRate/12;
	}
	double getMontlyInterest() {
		return (yearInterestRate/12)*this.balance;
	}
	public void withdraw(double a) {
		balance-=a;
	}
	public void deposit(double a) {
		balance+=a;
	}
	
	public String toString() {
		return "Balance: " + balance;
	}
}