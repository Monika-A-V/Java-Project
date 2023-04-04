package StringDemo;

public class Immutable {

	public static void main(String[] args) {

		String s="hello";
		System.out.println(s.hashCode());
		
	    s=	s.concat("hello");
	    System.out.println(s.hashCode());
	    System.out.println(s);
		System.out.println(s);

	}
}
