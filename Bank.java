package com.test.observer;

public interface Bank {
	public void open(Account o);
	public void close(Account o);
	public void notification();
}
