package com.Assignment_6;

/*Create a class Demo. In class Demo, declare a member 
variable x of type int as final.
In main method -
a. Create an object of type Demo. Try to change the value of x.
b. Now declare and implement a method display and 
make it final. Create a class DemoChild which 
extends Demo. In DemoChild, try to override the 
method display.
c. Now declare the class DemoChild as final 
and try to extend the class DemoChild.
*/
class Demo {
    final int x = 10;

    final void display() {
        System.out.println("Value of x: " + x);
    }
}

class DemoChild extends Demo {
    // This method cannot be overridden because it's declared as final in the parent class
    // void display() { }

    // This method can be overridden because it's not declared as final in the parent class
    void displayOverride() {
        System.out.println("Overridden display method in DemoChild class");
    }
}

final class FinalDemoChild extends DemoChild {
    // This class cannot be extended because it's declared as final
}
public class Q4 {

	public static void main(String[] args) {

		Demo demoObj = new Demo();
	    // Try to change the value of x - this will result in a compilation error because x is declared as final
	    // demoObj.x = 20;

	    demoObj.display();

	    DemoChild demoChildObj = new DemoChild();
	    // Call the display method of the DemoChild class - this will call the display method of the parent Demo class
	    demoChildObj.display();

	    demoChildObj.displayOverride();

	    FinalDemoChild finalDemoChildObj = new FinalDemoChild();
	    // Attempt to extend FinalDemoChild - this will result in a compilation error because FinalDemoChild is declared as final
	    // class AnotherClass extends FinalDemoChild { }
	}
	}


