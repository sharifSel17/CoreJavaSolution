package corejavainterviewpractice;

public class CalculateSumOfNumberOfArray_10 {
	public int calculateSumOfNumber(){
		int[] array = {10,20,30,40};
		int sum = 0;
		for(int arr:array){
			sum = sum+arr;
		}
		return sum;
	}
	public static void main(String[] args) {
		CalculateSumOfNumberOfArray_10 obj = new CalculateSumOfNumberOfArray_10();
		System.out.println(obj.calculateSumOfNumber());
	}

}
