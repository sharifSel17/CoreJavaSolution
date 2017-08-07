package wrapperclassinjava;

public class WrapperClassInJava_01 {

	public static void main(String[] args) {
		// Those all are primitive data type
		boolean data;//Boolean
		int data1;//Integer
		double data2;//Double
		char data3;//Character
		short data4;//Short
		long data5;//Long
		float data6;//Float
		byte data7;//Byte
		
		//int t = null;
		//Integer t1 = null;
		data = true;
		data1 = 100;
		
		Boolean obj = Boolean.valueOf(data);
		System.out.println(obj);
		
		Boolean boo = new Boolean(true);
		boo.booleanValue();
		
		Integer obj1 = Integer.valueOf(data1);
		System.out.println(obj1);
		
		Integer obj2 = new Integer(100);
		obj2.intValue();
		System.out.println(obj2);
		
		
		/*Integer in = data1;
		System.out.println(in);*/
		
		
	}

}
