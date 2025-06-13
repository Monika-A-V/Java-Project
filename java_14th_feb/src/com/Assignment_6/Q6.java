package com.Assignment_6;

/*Create interface Cake with a method declared as bake. Create 2 classes
Strawberry, BlackForest both implementing Cake interface*/

interface Cake {
    void bake();
}
class Strawberry implements Cake {
    @Override
    public void bake() {
        System.out.println("Baking a strawberry cake...");
    }
}
class BlackForest implements Cake {
    @Override
    public void bake() {
        System.out.println("Baking a black forest cake...");
    }
}
public class Q6 {

	public static void main(String[] args) {

		 Cake strawberryCake = new Strawberry();
	        Cake blackForestCake = new BlackForest();
	        
	        strawberryCake.bake();
	        blackForestCake.bake();
	    }
	}
	