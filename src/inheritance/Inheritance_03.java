package inheritance;

public class Inheritance_03 extends Inheritance_01 {

	Inheritance_03(){
		super(10,20);
		System.out.println("i am form child class constructor");
	}
	
	int x;
	int y;
	
	void test5(){
		
		System.out.println("i am from child class");
		
	}
	public static void main(String[] args) {
		
		Inheritance_03 obj1 = new Inheritance_03();
		System.out.println("==============");
		obj1.test01(20, 30);
		obj1.test02();
		obj1.test5();
		System.out.println("==============");
		Inheritance_01 obj2 = new Inheritance_03();
		obj2.test01(10, 20);
		obj2.test02();
	}

}
