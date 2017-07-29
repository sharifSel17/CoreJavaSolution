package stringinjava;

public class StringInJava_03 {

	public static void main(String[] args) {
		
		String s1 = "sharif";
		String s2 = "sharif";
		String s3 = new String("sharif");
		String s4 = "uddin";
		
		// string equals method compare the original contents of string
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));
		System.out.println("----------------------------------------");
		
		
		String s5 = "sharif";
		String s6 = "sharif";
		String s7 = new String("uddin");
		System.out.println(s5==s6);
		System.out.println(s5==s7);
	}

}
