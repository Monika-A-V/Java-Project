package com.Test_11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*Create List<Shipment> in which sorting is done according cities and if
 *  two order have same cities than according to shipment date(Ascending) 
 *  Shipment class (int shipId, String Cust_name, Address addr, MyDate shipDate) 
 *  Address class (String addr, String City, String State) MyDate class (int dd,mm,yy).
*/
class Address 
{
    public String addr;
    public String city;
    public String state;

    public Address(String addr, String city, String state)
    {
        this.addr = addr;
        this.city = city;
        this.state = state;
    }

    public String toString()
    {
        return "Address [addr=" + addr + ", city=" + city + ", state=" + state + "]";
    }
}

class MyDate implements Comparable<MyDate> {
    public int dd;
    public int mm;
    public int yy;

    public MyDate(int dd, int mm, int yy)
    {
        this.dd = dd;
        this.mm = mm;
        this.yy = yy;
    }
    


    @Override
	public String toString() {
		return "MyDate [dd=" + dd + ", mm=" + mm + ", yy=" + yy + "]";
	}



	public int compareTo(MyDate other) 
    {
        if (this.yy != other.yy)
        {
            return this.yy - other.yy;
        } 
        else if (this.mm != other.mm)
        {
            return this.mm - other.mm;
        } 
        else
        {
            return this.dd - other.dd;
        }
    }
}
        	
        	
class Shipment implements Comparable<Shipment> {
    public int shipId;
    public String cust_name;
    public Address addr;
    public MyDate shipDate;

    public Shipment(int shipId, String cust_name, Address addr, MyDate shipDate) 
    {
        this.shipId = shipId;
        this.cust_name = cust_name;
        this.addr = addr;
        this.shipDate = shipDate;
    }
    

    public int compareTo(Shipment other)
    {
        int cityCompare = this.addr.city.compareTo(other.addr.city);
        if (cityCompare != 0)
        {
            return cityCompare;
        }
        return this.shipDate.compareTo(other.shipDate);
    }

    public String toString() 
    {
        return "Shipment [shipId=" + shipId + ", cust_name=" + cust_name + ", addr=" + addr + ", shipDate=" + shipDate + "]";
    }
}

public class Q8 {

	public static void main(String[] args)
	{
		Shipment s1 = new Shipment(1, "John Doe", new Address("123 Main St", "Los Angeles", "CA"), new MyDate(5, 8, 2021));
        Shipment s2 = new Shipment(2, "Jane Doe", new Address("456 Oak St", "New York", "NY"), new MyDate(6, 8, 2021));
        Shipment s3 = new Shipment(3, "Bob Smith", new Address("789 Elm St", "Los Angeles", "CA"), new MyDate(7, 8, 2021));
        Shipment s4 = new Shipment(4, "Alice Jones", new Address("321 Maple St", "New York", "NY"), new MyDate(8, 8, 2021));

        List<Shipment> shipments = new ArrayList<>();
        shipments.add(s1);
        shipments.add(s2);
        shipments.add(s3);
        shipments.add(s4);

        Collections.sort(shipments);

        for (Shipment s : shipments)
        {
            System.out.println(s);
        }
    }
}
