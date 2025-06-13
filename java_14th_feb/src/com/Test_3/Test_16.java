package com.Test_3;

//).Write a program with Shopping class which has overloaded method
//‘doTransaction’. If it has CreditCard type parameter it should display message ‘You got 15%
//discount on bill on credit card transaction’.If it has DebitCard type parameter it should 
//display message ‘No discount on bill on debit card transaction’.

class Shopping
{
    public void doTransaction(CreditCard card)
    {
        System.out.println("You got 15% discount on bill on credit card transaction.");
       
    }

    public void doTransaction(DebitCard card)
    {
        System.out.println("No discount on bill on debit card transaction.");
    
    }
}
public class Test_16 
{
    public static void main(String[] args)
	{
	       Shopping shop = new Shopping();

	        CreditCard cc = new CreditCard();
	        DebitCard dc = new DebitCard();
	        
	        
            shop.doTransaction(cc);
	        shop.doTransaction(dc);
	}}
class CreditCard 
{
  
public CreditCard() 
    {
      
    }}
class DebitCard
{

public DebitCard()
{
       }}