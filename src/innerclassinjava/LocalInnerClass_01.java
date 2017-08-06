package innerclassinjava;

public class LocalInnerClass_01 {
	private int data = 100;
	
	void display(){
		class Local{
			void message(){
				System.out.println(data);
			}
		}
		Local l = new Local();
		l.message();
	}
	
	void display_2(){
		class Local{
			void message1(){
				System.out.println("I am from local class");
			}
		}
		Local l = new Local();
		l.message1();
	}
	public static void main(String []args){
		LocalInnerClass_01 obj1 = new LocalInnerClass_01();
		obj1.display();
		obj1.display_2();
	}
}
