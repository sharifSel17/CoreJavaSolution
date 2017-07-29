package thisKeyword;

public class ThisKeyword_02 {

	int a;
	int b;
	int c;
	static int d;

	void test01() {
		this.test02();
		System.out.println("i am from test 1");
	}

	void test02() {
		System.out.println("i am from test 2");
	}

	static void test03(int a) {
		System.out.println("i am from test 3");
	}

	void test04(ThisKeyword_02 obj) {
		System.out.println("method is invoked");
		System.out.println(obj.getClass().getName());
	}

	void test05() {
		test04(this);
		test03(20);
		System.out.println("i am from test 5");
	}

	public static void main(String[] args) {
		ThisKeyword_02 obj = new ThisKeyword_02();
		obj.test05();
		obj.test01();
	}

}
