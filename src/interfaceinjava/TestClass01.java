package interfaceinjava;

public class TestClass01 implements InterfaceInJava_01,InterfaceInJava_02{

	public static void test08(){
		System.out.println("i am from test08");
	}
	
	public void test01() {
		System.out.println("i amfrom test 01");
		
	}

	public void test02() {
		System.out.println("i amfrom test 02");
		
	}

	public void test03() {
		System.out.println("i amfrom test 03");
		
	}

	public void test05() {
		System.out.println("i amfrom test 05");
		
	}

	public void test06() {
		System.out.println("i amfrom test 06");
		
	}
	public void test04() {
		System.out.println("i am from test04");
		
	}
	public static void main(String[] args) {
		// we created reference for interface, as a result we would able to access only individual interface resources only but we can not access class or other resources
		InterfaceInJava_01 obj = new TestClass01(); 
		obj.test01();
		obj.test02();
		obj.test03();
		obj.test05();
		obj.test06();
		System.out.println(InterfaceInJava_01.i);
		System.out.println(InterfaceInJava_01.j);
		
		System.out.println("-------------------------------");
		InterfaceInJava_02 obj1 = new TestClass01();
		obj1.test04();
		
		
		System.out.println("--------------------------------");
		TestClass01 obj2 = new TestClass01();
		obj2.test01();
		obj2.test02();
		obj2.test03();
		obj2.test05();
		obj2.test06();
		obj2.test04();
		TestClass01.test08();
		System.out.println(InterfaceInJava_01.i);
		System.out.println(InterfaceInJava_01.i);
		
	}
}
