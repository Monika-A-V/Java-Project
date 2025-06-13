package com.Assignment_3;

//Give the real time example of encapsulation with code.

class BankAccount {
    private int accountNumber;
    private double balance;
    
    public BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    
    public int getAccountNumber() {
        return accountNumber;
    }
    
    public double getBalance() {
        return balance;
    }
    
    public void deposit(double amount) {
        balance += amount;
    }
    
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds");
        }
    }
}
public class Q9_Encapsulation {

	public static void main(String[] args) {
	    BankAccount myAccount = new BankAccount(123, 1000);
	    
	    int accountNumber = myAccount.getAccountNumber();
	    double balance = myAccount.getBalance();
	    
	    System.out.println("Account number: " + accountNumber);
	    System.out.println("Balance: " + balance);
	    
	    myAccount.deposit(500);
	    System.out.println("New balance after deposit: " + myAccount.getBalance());
	    
	    myAccount.withdraw(200);
	    System.out.println("New balance after withdrawal: " + myAccount.getBalance());
	    
	    myAccount.withdraw(1500);
	    System.out.println("Balance after attempted withdrawal: " + myAccount.getBalance());
	}
}


