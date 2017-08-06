package interfaceinjava;

public class TestBankOfAmerica implements InterfaceInJava_04{

	public void rateOfInterest() {
		System.out.println("Bank of America Interest rate is : 10%");
		
	}
	public static void main(String[] args) {
		TestBankOfAmerica obj = new TestBankOfAmerica();
		obj.rateOfInterest();
	}

}
