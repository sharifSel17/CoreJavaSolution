package finalclassmethodvariable;

public class TestFinalClass_01 extends FinalMethod_03{
	//we can not override final method
	/*final public void test02(){
		
	}*/
	
	public static void main(String[] args) {
		FinalClass_01 obj = new FinalClass_01();
		obj.test01();
		
		FinalMethod_03 obj1 = new FinalMethod_03();
		obj1.test02();
		
	}
	
}
