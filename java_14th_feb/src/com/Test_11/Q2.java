package com.Test_11;

import java.util.ArrayList;
import java.util.List;

/*Class Menu contains {Menu_id,Menu_name,List<MenuItem>} and
 *  MenuItem contains {MenuItem_id,MenuItem,Price} another
 *   class Order contains{oredr_id,Menu_id,MenuItem_id,custName} 
 *   create two arraylist one for Menu and other for Order
 *    find the total amount for WadaSambar from orderList for all customer.
*/

class MenuItem {
    int menuItemId;
    String menuItem;
    double price;

    MenuItem(int menuItemId, String menuItem, double price) {
        this.menuItemId = menuItemId;
        this.menuItem = menuItem;
        this.price = price;
    }
}

class Menu {
    int menuId;
    String menuName;
    List<MenuItem> menuItems;

    Menu(int menuId, String menuName, List<MenuItem> menuItems) {
        this.menuId = menuId;
        this.menuName = menuName;
        this.menuItems = menuItems;
    }
}

class Order {
    int orderId;
    int menuId;
    int menuItemId;
    String custName;

    Order(int orderId, int menuId, int menuItemId, String custName) {
        this.orderId = orderId;
        this.menuId = menuId;
        this.menuItemId = menuItemId;
        this.custName = custName;
    }
}

public class Q2 {

	public static void main(String[] args)
	{
		 MenuItem item1 = new MenuItem(1, "WadaSambar", 2.99);
	        MenuItem item2 = new MenuItem(2, "Idli", 1.99);
	        MenuItem item3 = new MenuItem(3, "Dosa", 3.99);

	        List<MenuItem> menuItems1 = new ArrayList<>();
	        menuItems1.add(item1);
	        menuItems1.add(item2);
	        Menu menu1 = new Menu(1, "Breakfast Menu", menuItems1);

	        List<MenuItem> menuItems2 = new ArrayList<>();
	        menuItems2.add(item1);
	        menuItems2.add(item3);
	        Menu menu2 = new Menu(2, "Lunch Menu", menuItems2);

	        List<Order> orders = new ArrayList<>();
	        orders.add(new Order(1, 1, 1, "John"));
	        orders.add(new Order(2, 1, 1, "Jane"));
	        orders.add(new Order(3, 2, 1, "Bob"));
	        orders.add(new Order(4, 2, 2, "Alice"));

	        double totalAmount = 0;
	        for (Order order : orders) {
	            if (menu1.menuId == order.menuId) {
	                for (MenuItem menuItem : menu1.menuItems) 
	                {
	                    if (menuItem.menuItemId == order.menuItemId && menuItem.menuItem.equals("WadaSambar")) {
	                        totalAmount += menuItem.price;
	                    }
	                }
	            }
	            else if (menu2.menuId == order.menuId)
	            {
	                for (MenuItem menuItem : menu2.menuItems)
	                {
	                    if (menuItem.menuItemId == order.menuItemId && menuItem.menuItem.equals("WadaSambar")) {
	                        totalAmount += menuItem.price;
	                    }
	                }
	            }
	        }

	        System.out.println("Total amount for WadaSambar from the order list for all customers: " + totalAmount);
	    }
	}