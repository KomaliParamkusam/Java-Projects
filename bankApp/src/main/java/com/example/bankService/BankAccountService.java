package com.example.bankService;

public class BankAccountService {
	private String accountNumber;
	private double balance;

	public BankAccountService(String accountNumber, double initialBalance) 
	{
		if (accountNumber == null || !accountNumber.matches("[A-Z]{2}\\d{4}")) 
		{
			throw new IllegalArgumentException("Invalid account number format");
		}
		if (initialBalance < 0) {
			throw new IllegalArgumentException("Initial balance cannot be negative");
		}
		this.accountNumber = accountNumber;
		this.balance = initialBalance;
	}

	public double getBalance() 
	{
		return balance;
	}

	public void deposit(double amount) 
	{
		if (amount <= 0)
			throw new IllegalArgumentException("Deposit must be positive");
		balance += amount;
	}

	public void withdraw(double amount) 
	{
		if (amount > balance)
			throw new IllegalArgumentException("Insufficient balance");
		balance -= amount;
	}

	public String getAccountNumber() 
	{
		return accountNumber;
	}
}
