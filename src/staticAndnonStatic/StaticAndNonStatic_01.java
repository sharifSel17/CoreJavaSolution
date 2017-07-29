package staticAndnonStatic;

public class StaticAndNonStatic_01 {

		int a;
		int b;
		static int x;
		static int y;
	
		
		public static void test1(){
			System.out.println("test1 static method");
		}
		public void test2(){
			System.out.println("test2 non-static method");
		}
		public static void test3(){
			System.out.println("test3 static method");
		}
		public void test4(){
			System.out.println("test4 non-static method");
		}
		public static void main(String[] args) {
			StaticAndNonStatic_01 obj = new StaticAndNonStatic_01();
			obj.test2();
			obj.test4();
			
			StaticAndNonStatic_01.test1();
			StaticAndNonStatic_01.test3();
				
		}

}
