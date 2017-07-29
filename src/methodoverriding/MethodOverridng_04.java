package methodoverriding;

public class MethodOverridng_04 extends MethodOverridng_03{
	
	 public void sum(int a, int b) {
		int sum = a+b;
		System.out.println("I am from child class : "+sum);
	}

	public void sum(int a, int b, int c) {
		int sum = a+b+c;
		System.out.println("I am from child class : "+ sum);
	}
	
	public static void main(String[] args) {
		MethodOverridng_03 obj = new MethodOverridng_04();
		obj.sum(10, 20);
		obj.sum(10, 20, 30);
		
		System.out.println("=============================");
		
		MethodOverridng_04 obj1 = new MethodOverridng_04();
		obj1.sum(10, 20);
		obj.sum(10, 20, 30);
		obj1.multiply(10, 20);
		
	}
}
