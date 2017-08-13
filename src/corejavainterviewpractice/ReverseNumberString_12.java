package corejavainterviewpractice;

import java.util.Scanner;

public class ReverseNumberString_12 {

	public void reverseNumber(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter any number");
		int number = sc.nextInt();
		int reverse = 0;
		while(number!=0){
			reverse = reverse*10;
			reverse = reverse+number%10;
			number = number/10;
		}
		System.out.println("Reverse number is :" +reverse);
	}
	public static void main(String[] args) {
		
		
		ReverseNumberString_12 obj = new ReverseNumberString_12();
		obj.reverseNumber();
		
		//for number 
		/*StringBuffer str = new StringBuffer("hello");
		System.out.println(str.reverse());*/

	}

}
