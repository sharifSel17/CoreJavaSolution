package interfaceinjava;

public class TestClass02 implements InterfaceInJava_03{

	

	public void substract() {
		System.out.println("Subscract of I and J is: "+(j-i));
	}
	public void sum() {
		System.out.println("Summasion of I and J is : "+(i+j));
		
	}
	public void multiply() {
		System.out.println("Multiplication of I and J is : "+(i*j));
		
	}
	public static void main(String[] args) {
		TestClass02 obj = new TestClass02();
		obj.substract();
		obj.sum();
		obj.multiply();
		System.out.println("-----------");
		InterfaceInJava_03 obj2 = new TestClass02();
		obj2.sum();
		obj2.multiply();
		System.out.println("------------");
		System.out.println(TestClass02.i);
		System.out.println(TestClass02.j);
		
	}
	

}
