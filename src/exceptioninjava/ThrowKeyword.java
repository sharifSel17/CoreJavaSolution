package exceptioninjava;

public class ThrowKeyword {
	public static void throwTest_01(int age){
		if(age<=18){
			throw new ArithmeticException("the girl are not eligible to get married !");
		}else{
			System.out.println("the girl are eligible to get married !!");
		}
	}
	
	public static void throwTest_02(int sum){
		if(sum==18){
			throw new NumberFormatException("Age under 18 are not eligible to vote !");
		}else{
			System.out.println("Age above 18 are eligible to vote !!");
		}
	}
	
	public static void main(String []arg){
		//throwTest_01(19);
		throwTest_02(19);
	}
}
