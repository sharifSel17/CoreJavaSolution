package accessModifiersInJava;

public class AccessModifier_01 {
	public int a;
	private int b;
	protected String c;
	int d;

	public void test01() {
		System.out.println("public void test01()");
	}

	private void test02() {
		System.out.println("private void test02()");
	}

	protected void test03() {
		System.out.println("protected void test03()");
	}

	void test04() {
		System.out.println("default void test04()");
	}

	public static void main(String[] args) {
		
		AccessModifier_01 obj = new AccessModifier_01();
		obj.test01();
		obj.test02();
		obj.test03();
		obj.test04();

	}

}
