package com.codsoft.Atm_Machine;

import java.util.Scanner;


public class ATM {
	
	private BankAcount user;

	public ATM(BankAcount user) {
		this.user = user;
	}

	public void showOptions() {
		System.out.println("1. Check Balance");
		System.out.println("2. Deposit Amount");
		System.out.println("3. Withdraw");
		System.out.println("4. Exit");
	}

	public void transaction(int option) {
		Scanner sc = new Scanner(System.in);
		switch (option) {
		case 1:
			System.out.println("Your balance is " + user.getbalance());
			break;
		case 2:
			System.out.println("Enter the deposit Amount");
			double depositMoney=sc.nextDouble();
			user.deposit(depositMoney);
			break;
		case 3:
			System.out.println("Enter the amount to Withdraw ");
			double withDrawMoney=sc.nextDouble();
			try {
				user.withDraw(withDrawMoney);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			break;
		case 4:
			System.out.println("Thank you for using our CODESOFT ATM");
			System.exit(0);
			break;
		default:
			System.out.println("invalid input. Please select valid input");
		}
	}
	
}
	
