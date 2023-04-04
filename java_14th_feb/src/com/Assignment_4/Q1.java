package com.Assignment_4;


class Account {
    long accountNo;
    String customerName;

    public Account() {
        accountNo = 0L;
        customerName = "";
        System.out.println("I am in default Constructor");
    }

    public Account(long accountNo, String customerName) {
        this.accountNo = accountNo;
        this.customerName = customerName;
        System.out.println("I am in parameterized constructor");
    }}
public class Q1 {
	
	public static void main(String[] args) {
        Account account1 = new Account();
        System.out.println("Account 1 details: ");
        System.out.println("Account Number: " + account1.accountNo);
        System.out.println("Customer Name: " + account1.customerName);

        Account account2 = new Account();
        System.out.println("Account 2 details: ");
        System.out.println("Account Number: " + account2.accountNo);
        System.out.println("Customer Name: " + account2.customerName);

        Account account3 = new Account(1234567890L, "Monika");
        System.out.println("Account 3 details: ");
        System.out.println("Account Number: " + account3.accountNo);
        System.out.println("Customer Name: " + account3.customerName);

        Account account4 = new Account(9876543210L, "pooja");
        System.out.println("Account 4 details: ");
        System.out.println("Account Number: " + account4.accountNo);
        System.out.println("Customer Name: " + account4.customerName);
    }
}
