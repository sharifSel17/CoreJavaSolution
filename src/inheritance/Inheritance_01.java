package inheritance;

public class Inheritance_01 {
	int a;
	int b;
	static int k = 200;
	
	Inheritance_01(int a, int b){
		System.out.println("i am from parents class constructor");
	}
	
	void test01(int x, int y) {
		this.a=x;
		this.b=y;
		System.out.println("i am from parent class and i am non-static method or class member");
	}

	void test02() {
		System.out.println("i am from parent class and i am non-static method or class member");
	}
	void display(){
		System.out.println("i am from method :"+a+","+b);
	}
	
	static void test4(){
		System.out.println("i am static method ");
	}
	
}
