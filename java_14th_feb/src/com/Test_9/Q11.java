package com.Test_9;

/*Create a class shoppingcart with following details - 
ShoppingCart { int shopid; String custname; List<Item> ,Int qty; String pmode}
Write method to accept shopping details with list of purchase items and purchase qty.
If pqty is negative or zero raise customized exception Invalid qty
Write a method void generatebill () to display shopping details along with total for Customer.
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class ShoppingCart
{
    int shopid;
    String custname;
    List<Item> itemList;
    List<Integer> qtyList;
    String pmode;

    public ShoppingCart(int shopid, String custname) 
    {
        this.shopid = shopid;
        this.custname = custname;
        this.itemList = new ArrayList<>();
        this.qtyList = new ArrayList<>();
    }

    public void acceptShoppingDetails(List<Item> itemList, List<Integer> qtyList)
    		throws InvalidQtyException 
    {
        if (itemList.size() != qtyList.size())
        {
            throw new IllegalArgumentException("List of items and list of quantities must be of same size.");
        }

        for (int qty : qtyList)
        {
            if (qty <= 0) 
            {
                throw new InvalidQtyException("Quantity cannot be negative or zero.");
            }
        }

        this.itemList = new ArrayList<>();
        this.qtyList = new ArrayList<>();

        for (int i = 0; i < itemList.size(); i++)
        {
            this.itemList.add(itemList.get(i));
            this.qtyList.add(qtyList.get(i));
        }
    }

    public void generateBill()
    {
        double total = 0.0;
        System.out.println("Shopping details:");
        System.out.println("Shop ID: " + shopid);
        System.out.println("Customer Name: " + custname);

        System.out.println("Item\t\tQuantity\tPrice\t\tTotal");
        for (int i = 0; i < itemList.size(); i++) 
        {
            Item item = itemList.get(i);
            int qty = qtyList.get(i);
            double price = item.getPrice();
            double itemTotal = qty * price;
            total += itemTotal;
            System.out.println(item.getName() + "\t\t" + qty + "\t\t" + price + "\t\t" + itemTotal);
        }

        System.out.println("Total:\t\t\t\t\t\t" + total);
    }
}

class InvalidQtyException extends Exception 
{
    public InvalidQtyException(String message) 
    {
        super(message);
    }
}

class Item 
{
    String name;
    double price;

    public Item(String name, double price)
    {
        this.name = name;
        this.price = price;
    }

    public String getName()
    {
        return name;
    }

    public double getPrice()
    {
        return price;
    }
}
public class Q11
{

	public static void main(String[] args) 
	{
		 ShoppingCart cart = new ShoppingCart(123, "John");

		    List<Item> itemList = new ArrayList<>();
		    itemList.add(new Item("Shirt", 25.0));
		    itemList.add(new Item("Pants", 30.0));
		    itemList.add(new Item("Shoes", 50.0));
		    
		    //List<Integer> qtyList = Arrays.asList(2, 1, 1);
		    List<Integer> qtyList = new ArrayList<>();
		    qtyList.add(2);
		    qtyList.add(1);
		    qtyList.add(1);
		    try 
		    {
		        cart.acceptShoppingDetails(itemList, qtyList);
		    } catch (InvalidQtyException e) 
		    {
		        System.out.println("Invalid quantity: " + e.getMessage());
		        return;
		    }

		    cart.generateBill();
		}

    }