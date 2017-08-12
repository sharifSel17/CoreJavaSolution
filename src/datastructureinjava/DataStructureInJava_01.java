package datastructureinjava;

public class DataStructureInJava_01 {
	static int x = 0;
	static int y = 0;
	static int n;

	// big O complexity means maximum time taken by any program to execute any piece of code
	public static void main(String[] args) {
		// what will be time complexity of the bellow code?
		int z = x + y;
		// Time complexity O(1) why because this will execute only one time

		System.out.println("----------------");
		int k = x + y; // O(1)
		for (int i = 0; i < n; i++) { // O(n)
			int a = x+y; //O(n)
		}
		
		//O(1)+O(n)
		//O(1+n)=O(n)
		// one thing we have to keep in mind when we do time complexity, so when n value is very large then constant will become negligible so assume that when n = 1000 and constant is 1 so in that case 1 will be negligible  
	}

}
