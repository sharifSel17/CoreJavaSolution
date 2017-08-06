package innerclassinjava;

public class AnonymousClass_02 {
	public void showImplementationOfAnonymousClass(){
	AbstarctClassTest obj = new AbstarctClassTest(){
		@Override
		public void test_03() {
			System.out.println("I am from test 03");
			
		}
	};
	obj.test_03();
}
	public static void main(String []args){
		AnonymousClass_02 obj1 = new AnonymousClass_02();
		obj1.showImplementationOfAnonymousClass();
	}
}
