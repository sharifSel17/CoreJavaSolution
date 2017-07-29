package typeOfconstructor;
	
public class Constructor_01 {
	int a;
	int b;
	Constructor_01(){
		System.out.println("I am from default constructor");
	}
	Constructor_01(int a){
		this.a=a;
		System.out.println("I am from parameterized constructor :"+a);
	}
	Constructor_01(int a, int b){
		this.a=a;
		this.b=b;
		System.out.println("I am from parameterized constructor :"+a);
	}
	void display(){
		System.out.println("i am from display method :"+a);
	}
	void sum(){
		int c=a+b;
		System.out.println("summation of the number is C :"+c);
	}
	public static void main(String[] args) {
		Constructor_01 obj = new Constructor_01();
		obj.display();
		Constructor_01 obj1 = new Constructor_01(12);
		Constructor_01 obj2 = new Constructor_01(12,12);
		obj1.display();
		System.out.println("==================");
		obj2.sum();
	}
}
 