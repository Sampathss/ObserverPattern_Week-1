package com.test.observer;

public class BankSimulator {

	public static void main(String[] args) {
		Bank bank = new Banking();
		Account account = new AccountIP(bank);
		account.create("Parmesh");
		account.create("Arvind");
		account.create("Sandeep");
		bank.close(account);
	}
}
