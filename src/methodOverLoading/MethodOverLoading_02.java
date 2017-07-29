package methodOverLoading;

public class MethodOverLoading_02 {

	public void bmwModel(int a, int b) {
		System.out.println("we can do overloading the method by changing the data type as int");
	}

	public void bmwModel(String a, String b, String c) {
		System.out.println("we can do overloading the method by changing the data type as string");
	}
	public static void main(String[] args) {
		
		MethodOverLoading_02 obj = new MethodOverLoading_02();
		obj.bmwModel(100, 200);
		obj.bmwModel("i am from string", "i am from string", "i am from string");
		
	}

}
