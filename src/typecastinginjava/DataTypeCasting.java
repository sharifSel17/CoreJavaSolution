package typecastinginjava;

public class DataTypeCasting {
	
	public double test01(){
		return 10.0;
	}
	public int test02(int i){
		System.out.println(i);
		return i;
	}
	public void test03(short s){
		System.out.println(s);
	}
	
	
	
	//byte<short<int<long>float<double
	public static void main(String[] args) {
		int a = 60;
		double b = 6.7;
		float c = 80;
		short d = 90;
		long l = 90;
		
		b = a;
		System.out.println(b);
		
		a = (int)b;
		System.out.println(a);
		
		l = d;
		d = (short)l;
		System.out.println(d);
		
		System.out.println("==================");
		
		DataTypeCasting obj = new DataTypeCasting();
		double data = obj.test01();
		System.out.println(data);
		obj.test02((int)data);
		
		int data1 = obj.test02(50);
		obj.test03((short)data1);
		
		obj.test03((short)data1);
	 
	}

}
