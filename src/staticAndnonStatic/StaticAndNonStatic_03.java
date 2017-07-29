package staticAndnonStatic;

public class StaticAndNonStatic_03 {

	int a = 10;
	static int b = 20;
	
	public static void test_01(){
		System.out.println(b);
	}
	public void test_02(){
		System.out.println(a);
		System.out.println(b);
	}
	
	public static void main(String [] args){
		
		StaticAndNonStatic_03 obj = new StaticAndNonStatic_03();
		obj.test_02();
		StaticAndNonStatic_03.test_01();
		
	}

}
