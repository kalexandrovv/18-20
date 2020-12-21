package Accaunt19;

public class Account19Test {

	public static void main(String[] args) {
		Account19 ac = new Account19(1929, 2300, 4.5);
		ac.withdraw(2500);
		ac.deposit(3000);
		System.out.println(ac.getBalance());
		System.out.println(ac.getMonthlyInterestRate());
		System.out.println(ac.dateCreated());

		SavingsAccount19 ac2 = new SavingsAccount19(1929, 2300);
		ac2.withdraw(2500);
		ac2.deposit(3000);
		System.out.println(ac2.getBalance());
		System.out.println(ac2.getMonthlyInterestRate());
		System.out.println(ac2.dateCreated());
		
	}
}