package methodoverriding;

public class MethodOverRiding_2 extends MethodOverRiding_01 {
	
	public int test02(int a){
		System.out.println("I am from child test01");
		return a;
	}
	
	public static void main(String[] args) {
		MethodOverRiding_2 obj = new MethodOverRiding_2();
		obj.test02();
		obj.test02();
		
		
	}
}
