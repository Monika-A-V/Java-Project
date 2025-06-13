package com.Assignment_6;

/*. Create interface IceCream with method eat and Juice with method drink, 
Create class Mastani which implements both interfaces*/

interface IceCream {
    void eat();
}
interface Juice {
    void drink();
}
class Mastani implements IceCream, Juice {

    public void eat() {
        System.out.println("Eating Mastani ice cream");
    }

    public void drink() {
        System.out.println("Drinking Mastani juice");
    }

}
public class Q8 {

	public static void main(String[] args) {

		 Mastani mastani = new Mastani();

		    mastani.eat();
		    mastani.drink();
	}

}
