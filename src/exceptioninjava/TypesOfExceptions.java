package exceptioninjava;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

public class TypesOfExceptions extends Test{

	static String s1;

	public static void aritmeticException() {
		int a = 10 / 0;
	}

	public static void nullPointerException() {
		System.out.println(s1.concat("sharif"));
	}
 
	public static void stackOverFlow() {
		ArrayList<Integer> array = new ArrayList<Integer>();
		while (true) {
			array.add(10);
		}
	}

	public static void numberFormatingException() {
		String s1 = "sharif";
		int t1 = Integer.parseInt(s1);
		System.out.println(t1);
	}

	public static void fileNotFoundException() throws FileNotFoundException {
		FileReader file = new FileReader("C://sharif//myTest.xls");
	}

	public static void classNotFoundException() throws ClassNotFoundException {
		Class.forName("TypesOfExceptions");
	}

	public static void arrayIndexOfBound(){
		int a[]  = new int[5];
		System.out.println(a[6]);
		
	}
	
	public static void outOfMemory(){
		long data[] = new long[1000909090];
	}

	public static void classCastException(){
		Test obj = new Test();
		System.out.println((TypesOfExceptions)obj);
	}
	public static void main(String[] args) throws Exception {

		/*
		 * nullPointerException(); 
		 * aritmeticException(); 
		 * stackOverFlow();
		 * numberFormatingException();
		 * fileNotFoundException(); 
		 * classNotFoundException();
		 * arrayIndexOfBound();
		 * outOfMemory();
		 * classCastException();
		 */
		classCastException();
	}

}
