package prepostincrement;

public class PrePostIncrement_04 {

	public static void main(String[] args) {
		int i = 2;
		
		System.out.println(i);
		System.out.println("=============");
		
		int k = --i;
		int m = i--;
		
		System.out.println(k);
		System.out.println(m);
		System.out.println("=============");
		System.out.println(i);

	}

}
