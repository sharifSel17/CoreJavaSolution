package exceptioninjava;

public class TryCatch extends Test {
	static String s1;

	public void test_01() {
		try {

		} catch (Exception arg) {
			// Exception is a super class of all the exception either it's a
			// checked or unchecked exception
			// In the catch block we can do perform some action based on the
			// requirement or we can print the exception
			// printStackTrace(), this a method which will print the error on
			// run time
			// Exception will goes to try block statement and error message or
			// action will goes to catch block
		}
	}

	public static void arithMaticExceptionHandling() {

		try {

			int array[] = new int[10];
			array[10] = 50 / 1;

		} catch (ArithmeticException val1) {
			System.out.println(
					"This arithmatic exception ! we can't divide any number by zero but coding is working fine !!");
			// val1.printStackTrace();
		} catch (NullPointerException nl) {
			System.out.println("This is a nullpointer exception");
			// nl.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException in) {
			System.out.println("this is a Array Index Out Of Bounds Exception exception ");
			in.printStackTrace();
		} catch (Exception ex) {
			System.out.println("this is super class");
		}
		System.out.println("This is the benefit of try catch statement");

	}

	// multiple catch for checked exception
	public static void multiplrCatch() {
		try {
			Class.forName("test");
		} catch (NullPointerException ex) {
			System.out.println("class not found exception");
		} catch (ArithmeticException ex) {
			System.out.println("this is not arithmetic exception");
		} catch (Exception e) {
			System.out.println("this is a super class exception");
		}
	}

	// multiple try catch inside the try catch using super class exception
	public static void multiplTryCatchSingleTryCatch() {
		try {
			try {
				int ar[] = new int[5];
				ar[6] = 20 / 0;
			} catch (Exception ex) {
				System.out.println("this exception is handle by inner try catch block");
			}
		} catch (ArithmeticException ex) {
			System.out.println("this is a arith matic excpetion");
		} catch (NullPointerException nl) {
			System.out.println("this is a null pointer exception");
		}
		System.out.println("when we will write inner class try catch it will never come external try catch");
	}

	//// multiple try catch inside the try catch using sub class exception b y
	//// force fully
	public static void multiplTryCatchSingleTryCatch_2() {
		try {
			try {
				int ar[] = new int[5];
				ar[6] = 20 / 0;
			} catch (Exception ex) {
				System.out.println("this exception is handle by external try catch block by forcefully");
				throw new ArithmeticException();
			}
		} catch (ArithmeticException ex) {
			System.out.println("this is a arith matic excpetion");
		} catch (NullPointerException nl) {
			System.out.println("this is a null pointer exception");
		}
	}

	// Nested try block catch
	public static void nestedTryCatchBlock() {
		try{
			try{
				System.out.println("divide by zero");
				int ar[] = new int[4];
				ar[40] = 5/0;
			}catch(ArithmeticException ar){
				System.out.println(ar);
				throw new ArithmeticException();
			}
			try{
				System.out.println("null pionter");
				System.out.println(s1.concat("sharif"));
			}catch(NullPointerException nl){
				System.out.println(nl);
			}
		}catch(Exception ex){
			System.out.println("this is a super class exceptoion");
		}
		System.out.println("rest of the code");
	}

	public static void main(String[] arg) {
		// arithMaticExceptionHandling();
		// multiplrCatch();
		// multiplTryCatchSingleTryCatch();
		//multiplTryCatchSingleTryCatch_2();
		nestedTryCatchBlock();
	}
}
