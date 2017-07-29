package inheritance02;

public class B extends A {
	public static void main(String[] args) {
		B obj = new B();
		System.out.println(obj.a);
		System.out.println(obj.b);
		System.out.println("=============");
		obj.test1();
		obj.test2();
	}
}
