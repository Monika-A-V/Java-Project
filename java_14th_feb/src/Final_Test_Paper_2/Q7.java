package Final_Test_Paper_2;

/*Will this program give error. If so solve the error such that flow or requirement
 *  is not disturbed [1M]

class Parent { public Parent() {

}

public Parent(int i) {

}
}

class Child extends Parent {

public Child() {

super(10);

this(10);

}

public Child(int i) {

}

}*/

class Parent 
{ 
	public Parent()
	{
		System.out.println("I AM DEFAULT");

}

public Parent(int i) 
{
	System.out.println("I AM PARAMETERIZED");

}
}

class Child extends Parent
{

public Child()
{

this(10);
System.out.println("I AM DEFAULT CHILD");
}

public Child(int i) 
{
System.out.println("I AM PARA CHILD");
}

}
public class Q7 {

	public static void main(String[] args) 
	{
		Child c=new Child();
}

}
