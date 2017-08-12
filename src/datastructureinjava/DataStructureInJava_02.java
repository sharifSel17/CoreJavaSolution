package datastructureinjava;

public class DataStructureInJava_02 {

	public static void main(String[] args) {
		int i = 10;
		//int j = 2+3; //O(1)
		
		for (int k = 0; k < i; k++) {//O(n)
			for (int k2 = 0; k2 <i; k2++) {//O(n) 
				System.out.println(i);
			}
		}
				

	}
	//O(1)+O(n^2) = O(1+n%2) = O(n^2)
	// first block will execute n time and second block will execute n time so basically this program will execute O(n^2)
	//
}
