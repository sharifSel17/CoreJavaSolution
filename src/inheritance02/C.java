package inheritance02;

public class C extends B {
	public static void main(String[] args) {
		C obj = new C();
		System.out.println(obj.a);
		System.out.println(obj.a);
		System.out.println("=======================");
		obj.test1();
		obj.test2();
	}
}
