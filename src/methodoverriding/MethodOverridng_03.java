package methodoverriding;

public class MethodOverridng_03 {
	int a;
	int b;
	
	public void sum(int a, int b) {
		int sum1 = a+b;
		System.out.println("I am from parents class : "+sum1);
	}

	public void sum(int a, int b, int c) {
		int sum = a+b+c;
		System.out.println("I am from parents class : "+sum);
	}

	public void multiply(int a, int b) {
		int total = a*b;
		System.out.println("I am from parents class : "+total);
	}
}
