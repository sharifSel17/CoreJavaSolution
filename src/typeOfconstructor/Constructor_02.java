package typeOfconstructor;

public class Constructor_02 {

	int a;
	int b;
	int c;

	Constructor_02() {

		System.out.println("I am from default constructor !! :");
	}

	Constructor_02(int x, int y, int z) {

		this.a = x;
		this.b = y;
		this.c = z;

	}

	Constructor_02(int a) {
		this.a = a;
	}

	Constructor_02(String b) {

		System.out.println("i am from string ");

	}

	void test2() {
		System.out.println("i am from integer : " + a);
	}

	void result() {

		System.out.println("value of: " + a + ", " + b + ", " + c);

	}

	public static void main(String[] args) {

		Constructor_02 obj = new Constructor_02(10, 20, 30);
		obj.result();
		Constructor_02 obj2 = new Constructor_02(100);
		obj2.test2();
		Constructor_02 obj3 = new Constructor_02("Sharif");

	}

}
