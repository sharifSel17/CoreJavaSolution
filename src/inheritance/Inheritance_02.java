package inheritance;

public class Inheritance_02 extends Inheritance_01{
	
	Inheritance_02(){
		super(10, 20);
		System.out.println("i am form child class constructor");
	}
	
	int c;
	static int e = 200;
	void test3(){
		System.out.println("i am from child class");
	}
	public static void main(String[] args) {
		
		Inheritance_02 obj = new Inheritance_02();
		System.out.println("=========================");
		obj.test01(10,20);
		obj.test02();
		obj.test3();
		
		test4();
		
		System.out.println(obj.a);
		System.out.println(obj.b);
		System.out.println(obj.c);
		System.out.println(k);
		System.out.println(e);
		

	}

}
