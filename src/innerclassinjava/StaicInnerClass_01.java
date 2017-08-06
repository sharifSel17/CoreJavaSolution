package innerclassinjava;

public class StaicInnerClass_01 {
	static int data = 20;
	
	static void message1(){
		System.out.println("I am from static method ! ");
	}
	
	static class inner{
		void message(){
			System.out.println("data is : "+data);
			message1();
		}
	}
	
	public static void main(String []args){
		StaicInnerClass_01.inner obj = new StaicInnerClass_01.inner();
		obj.message();
		
		StaicInnerClass_01.message1();
	}
}
