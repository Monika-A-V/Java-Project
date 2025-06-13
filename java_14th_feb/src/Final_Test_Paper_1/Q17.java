package Final_Test_Paper_1;

/*class A {
	String s = "Class A";
}

class B extends A {
	String s = "Class B";
	{
		System.out.println(super.s);
	}
}
class C extends B {
	String s = "Class C";

	{
		System.out.println(super.s + super.super.s);
	}
}
public class MainClassLevel {
	public static void main(String[] args) {
		C c = new C();
		System.out.println(c.s);
	}
}

*/

class A {
	String s = "Class A";
}

class B extends A {
	String s = "Class B";
	{
		System.out.println(super.s);
	}
}
class C extends B {
	String s = "Class C";
	{

		System.out.println(super.s + super.s);
	}
}
public class Q17 {

	public static void main(String[] args) 
	{
		C c = new C();
		System.out.println(c.s);

	}

}
