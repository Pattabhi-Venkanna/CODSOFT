package com.codsoft.Atm_Machine;

import java.util.Scanner;



public class AtmMachine {
	
	public static void main(String[] args) {
		System.out.println("Welcome to CODESOFT ATM ");
		BankAcount user = new BankAcount(1000);
		ATM atm = new ATM(user);
		while (true) {

			atm.showOptions();

			Scanner sc = new Scanner(System.in);
			System.out.println("enter your choice: ");
			int option = sc.nextInt();
			atm.transaction(option);
		}

	}
	
}
