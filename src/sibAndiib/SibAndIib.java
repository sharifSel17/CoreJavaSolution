package sibAndiib;

public class SibAndIib {
	int a;
	static int b;
	
	static {
		b = 400;
		System.out.println("static initialation block-1");
	}
	static {
		System.out.println("static initialation block-2");
	}
	{
		a = 300;
		System.out.println("instance initialation block-2");
	}
	{
		System.out.println("instance initialation block-3");
	}

	public static void main(String[] args) {
		SibAndIib obj = new SibAndIib();
		System.out.println("====================");
		SibAndIib obj2 = new SibAndIib();
		System.out.println("====================");
		System.out.println(SibAndIib.b);
		System.out.println("====================");
		System.out.println(obj.a);
		System.out.println("====================");
		System.out.println(obj2.a);
	}

}
