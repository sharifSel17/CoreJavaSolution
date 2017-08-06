package innerclassinjava;

public class InnerClass_02 {
	
	int total = 100;
	
	public void test_02(){
		System.out.println("I am from outer class !!");
	}
	class inner1{
		public void test_01(){
			System.out.println("I am from inner class !!");
		test_02();
		}
		public void showData(){
			System.out.println(total);
		}
	}
	public static void main(String []args){
		InnerClass_02 obj = new InnerClass_02();
		InnerClass_02.inner1 inner= obj.new inner1();
		
		inner.test_01();
		inner.showData();
	}
}
