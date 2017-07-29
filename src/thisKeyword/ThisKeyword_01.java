package thisKeyword;

public class ThisKeyword_01 {
	int a;
	int b;
	int c;
	static int d;

	ThisKeyword_01() {
		System.out.println("i am from default constructor : ");
	}

	ThisKeyword_01(int x, int y) {
		this();
		System.out.println("I am from parameterized constructor 2");
		this.a = x;
		this.b = y;
	}

	ThisKeyword_01(int x, int y, int z) {
		this(x,y);
		System.out.println("I am from parameterized constructor 3");
		this.c=z;
	}
	void display (){
		System.out.println("value of x, y, z is :- "+a+","+b+","+c);
	}

	public static void main(String[] args) {
		ThisKeyword_01 obj = new ThisKeyword_01(20,30,40);
		obj.display();

	}

}
