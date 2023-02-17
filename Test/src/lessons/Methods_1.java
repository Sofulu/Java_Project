package lessons;

public class Methods_1 {
	public static void main(String[] args) {
		foo();
		
	}
	public static void foo() {

		boolean b = foo2();
		if(b == true) 
			foo1();
		
	}
	
	public static String foo1() {
		System.out.println("foo1 is called");
		return "This is foo1";
	}
	
	public static Boolean foo2() {
		System.out.println("foo2 is called");
		return true;
	
	}
	
	public static Boolean ParametrliMethod(String name) {
		System.out.println("My name is " + name);
		return true;
		
	}
}

