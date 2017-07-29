package returntype;

public class ReturnType_01 {

	public void test01() {
		System.out.println("i am from void");
	}

	public int test02(int b) {
		System.out.println("i am from integer");
		return b;
	}

	public boolean test03() {
		System.out.println("i am from boolean");
		return false;
	}

	public ReturnType_01 test04(ReturnType_01 obj) {
		System.out.println("i am from char");
		System.out.println(obj.getClass());
		return new ReturnType_01();
	}

	public double test05(double b, double c) {
		System.out.println("i am from double");
		return b+c;
	}

	public ReturnType_01 test06(int a) {
		System.out.println(" i am from class");
		return this;
	}

	public static void main(String[] args) {
		
		ReturnType_01 obj = new ReturnType_01();
		obj.test01();
		int var1 = obj.test02(2);
		System.out.println("this is second test :- "+var1);
		
		ReturnType_01 var2 = obj.test06(5);
		System.out.println("this class type : -"+var2 );
		
		ReturnType_01 var3 = obj.test04(obj);
		System.out.println(var3);

	}

}
