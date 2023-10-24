package com.codsoft.Atm_Machine;



public class BankAcount {
	
	private double balance;
	public BankAcount(double mainBalance) {
		balance = mainBalance;
	}
	public double getbalance() {
		return balance;
	}
	 public void deposit(double money) {
		 if (money>0) {
			balance =balance+money;
			System.out.println("Your current balance is " +balance);
		} 
		 else {
			 System.out.println("Enter correct deposit amount: ");
		}
	 }
	 public void withDraw(double money) throws BalanceException{
		 
		 if (money > 0) {
			if (balance > money) {
				balance = balance-money;
				System.out.println("Withdraw succesful");
				System.out.println("Available balance " +balance);
			} else {
				throw new BalanceException("Insufficient balance ");
			}
		} else {
			System.out.println("Enter Valid amount");
		}
		 
	 }
	
}
