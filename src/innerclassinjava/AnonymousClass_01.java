package innerclassinjava;

public class AnonymousClass_01 {
	
	public static void main(String []args){
		AnonymousTest obj = new AnonymousTest() {
			public void test_01() {
				System.out.println("i am test_01");
			}

			public void test_02() {
				System.out.println("i am test_02");
				
			}

			
		};
		obj.test_01();
		obj.test_02();
	}
}
