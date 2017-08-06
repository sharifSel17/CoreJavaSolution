package exceptioninjava;

public class FinallyBlock {

	public static void finallyBlock_01() {
		try {

		} catch (Exception e) {

		} finally {
			System.out.println(
					"Finally block will execute always some important piece of code whatever exception in block");
		}
	}

	public static void finallyBlock_02() {
		try {
			int data = 10 / 0;

		} finally {
			System.out.println("Finally block will execute always some important piece of code whatever exception in block");
		}
	}

	public static void finallyBlock_03(){
		
		try{
			int data = 90/0;
			System.out.println(data);
		}catch(Exception ex){
			System.out.println(ex);
		}finally{
			System.out.println("Finally block will execute always some important piece of code whatever exception in block");
			
		}
	}
	
	
	public static void main(String[] args) {
		// finallyBlock_01();
		//finallyBlock_02();
		finallyBlock_03();
	}

}
