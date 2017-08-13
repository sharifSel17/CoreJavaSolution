package corejavainterviewpractice;

public class BubleSortInJava_06 {
	
	public static void doBubleSort(int array[]){
		int temp;
		for (int i = 0; i < array.length; i++) {
			for (int j = i+1; j < array.length; j++) {
				if (array[i]>array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		printArray(array);
	}
	
	public static void printArray(int input[]){
		for (int i = 0; i < input.length; i++) {
			System.out.println(input[i]+",");
		}
		System.out.println("\n");
	}

	public static void main(String[] args) {
		int []array = {5,6,9,11,3,2};
		doBubleSort(array);
	}

}
