package com.test.observer;

public class AccountIP implements Account {
	private String username;
	private Bank bank;
	
	public AccountIP(Bank bank) {
		this.bank = bank;
		bank.open(this);
	}
	
	public void create(String username) {
		this.username = username;
		display();
	}
	
	public void display() {
		System.out.println("username: " + username);
	}


}
