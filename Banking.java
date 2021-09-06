package com.test.observer;

import java.util.ArrayList;
import java.util.List;


public class Banking implements Bank {
	private List<Account> accounts;
	private String username = "";
	
	public Banking() {
		accounts = new ArrayList<Account>();
	}
	
	public void open(Account o) {
		accounts.add(o);
	}
	
	public void close(Account o) {
		accounts.remove(o);
	}
	
	public void notification() {
		for (Account account : accounts) {
			account.create(username);
		}
	}
	
	public void setUsername(String username) {
		this.username = username;
		notification();
	}
}
