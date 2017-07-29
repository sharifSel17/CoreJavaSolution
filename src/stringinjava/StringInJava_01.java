package stringinjava;

public class StringInJava_01 {

	public static void main(String[] args) {
		// creating string object by string literal
		String s1 = "sharif";
		String s2 = "uddin";
		String s3 = "sharif uddin";
		//converting char array to string
		char ch[] = {'T','E','S','T'}; 
		String s4 = new String(ch);
		//creating java string object by new keyword operator 
		String s5 = new String("Example of new keyword operator");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
	}

}
