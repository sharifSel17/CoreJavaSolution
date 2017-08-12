package datastructureinjava;

public class DataStructureInJava_03 {

	public static void main(String[] args) {
		int i = 2;
		int j = 1;
		//int j = 2+3; //O(1)
		
		for (int k = 0; k < i; k++) {//O(n)
			for (int k2 = 0; k2 <i; k2++) {//O(n) 
				for (int k3 = 0; k3 < i; k3++) {//O(n)
					System.out.println(j);
				}
			}
		}
				

	}
	//O(1)+O(n^3) = O(1+n^3) = O(n^3)
	// first block will execute n time and second block will execute n time and third block will execute also n time so basically this program will execute O(n^3)
	//
}
