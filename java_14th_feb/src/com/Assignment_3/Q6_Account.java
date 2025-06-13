package com.Assignment_3;

//Create a class Account containing following methods -
//insert () to insert account data 
//display () to display account information 
//deposit () to deposit amount 
//withdraw () to withdraw amount 
//check_balance() to check balance

class Account {
    private int accountNumber;
    private String accountHolder;
    private double balance;

    public void insert(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public void display() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit of " + amount + " successful.");
    }

    public void withdraw(double amount) {
        if (balance < amount) {
            System.out.println("Insufficient balance.");
        } else {
            balance -= amount;
            System.out.println("Withdrawal of " + amount + " successful.");
        }
    }

    public void check_balance() {
        System.out.println("Balance: " + balance);
    }
}

public class Q6_Account {
	public static void main(String[] args)
	{
		Account myAccount = new Account();
		myAccount.insert(123456, "monu", 1000.0);
		myAccount.display();
		myAccount.deposit(500.0);
		myAccount.check_balance();
		myAccount.withdraw(200.0);
		myAccount.check_balance();

	}

}
