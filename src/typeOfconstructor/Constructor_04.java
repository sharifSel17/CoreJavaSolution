package typeOfconstructor;

public class Constructor_04 extends Constructor_03{
	Constructor_04(){
		super("super");
		System.out.println("I am from child construcotr");
	}
	Constructor_04(String b){
		System.out.println("I am from parameterized constructor");
	}
	public static void main(String[] args) {
		Constructor_04 obj = new Constructor_04();

	}

}
