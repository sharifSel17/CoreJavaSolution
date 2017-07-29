package thisKeyword;

public class ThisKeyword_03 {

	int a;
	int b;

	void test01(int a, int b) {
		this.a = a;
		this.b = b;
	}

	void test02(int x, int y) {

		a = x;
		b = y;
	}

	void display() {

		System.out.println("value of a and b : " + a + ", " + b);
	}

	public static void main(String[] args) {

		ThisKeyword_03 obj = new ThisKeyword_03();
		//obj.test01(10, 20);
		obj.test02(100, 200);
		obj.display();
	}

}
