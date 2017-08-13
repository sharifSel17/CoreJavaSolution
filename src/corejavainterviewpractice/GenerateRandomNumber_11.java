package corejavainterviewpractice;

import java.util.Random;

public class GenerateRandomNumber_11 {
	
	public void generateRandomNumber(){
		Random ran = new Random();
		for (int i = 0; i < 10; i++) {
			int number = ran.nextInt(50);
			System.out.println(number);
		}
	}
	public static void main(String[] args) {
		GenerateRandomNumber_11 obj = new GenerateRandomNumber_11();
		obj.generateRandomNumber();

	}

}
