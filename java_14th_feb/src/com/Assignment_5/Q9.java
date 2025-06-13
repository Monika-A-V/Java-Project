package com.Assignment_5;

/*Create a class Teenager which extends Kid created above and Implement 
readBook() differently in Teenager class. In main method, declare two 
variables k1,k2 of type Kid. Create objects of type BigKid and Teenager such 
that K1 should reference object of class BigKid and K2 should reference 
object of class Teenager, Call their respective readBook() methods.*/

class Kid1 {
    public void readBook() {
        System.out.println("I'm reading a picture book.");
    }
}
class Teenager extends Kid1 {
    public void readBook() {
        System.out.println("I'm reading a book about social media.");
    }
}
class BigKid1 extends Kid1 {
    @Override
    public void readBook() {
        System.out.println("Big kid is reading a big book.");
    }
}

public class Q9 {

	public static void main(String[] args) {

		    Kid1 k1 = new BigKid1();
		    Kid1 k2 = new Teenager();
		    k1.readBook();
		    k2.readBook();
		}
	}
