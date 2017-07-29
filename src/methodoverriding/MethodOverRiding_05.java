package methodoverriding;

public class MethodOverRiding_05 {
	void test01(){
		System.out.println("i am from MethodOverRiding_05 test01");
	}
	private void test02(){
		System.out.println("i am from MethodOverRiding_05 test02");
	}
	public static void test03(){
		System.out.println("i am from MethodOverRiding_05 test03");
	}
	public final void test04(){
		System.out.println("i am from MethodOverRiding_05 test04");
	}
	/*public static void main(String[] args) {
		MethodOverRiding_05 obj = new MethodOverRiding_05();
		obj.test01();
		obj.test02();
		MethodOverRiding_05.test03();
		obj.test04();
	}
*/
}
