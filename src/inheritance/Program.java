package inheritance;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		Account acc = new Account(1001, "Alex", 0.0);

		BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);

		// UPCASTING
		Account acc1 = bacc;
		Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
		Account acc3 = new SavingsAccount(1004, "Ana", 0.0, 0.01);

		// DOWNCASTING

		BusinessAccount acc4 = (BusinessAccount) acc2;
		acc4.loan(100);

		// BusinessAccount acc5 = (BusinessAccount) acc3; // is not allowed

		if (acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount) acc3;
			acc5.loan(200);
			System.out.println("Loan!");
		}
		if (acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount) acc3;
			acc5.updateBalance();
			System.out.println("Update!");
		}
		
		Account acc6 = new Account(1001, "Gustavo", 1000.0);
		acc6.withDraw(200);
		System.out.println(acc6.getBalance());
		
		Account acc7 = new SavingsAccount(1002, "Tiago", 1000.0, 0.01); 
		
		acc7.withDraw(200);
		
		System.out.println(acc7.getBalance());
		
		Account acc8 = new BusinessAccount(1003, "Gabriel", 1000.0,500.0);
		acc8.withDraw(200);
		
		System.out.println(acc8.getBalance());
	}

}
