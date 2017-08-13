package corejavainterviewpractice;

public class IsPrimeNumber_07 {
	public void checkPrimeNumber(int n){
		boolean flag = false;
		for (int i = 2; i <= n/2; i++) {
			if(n%i == 0){
				flag=true;
				break;
			}else{
				flag=false;
			}
		}
		if(!flag){
			System.out.println("Given number : " +n+ " is prime");
		}else{
			System.out.println("Given number : " +n+ " is not prime");
		}
	}
	public static void main(String[] args) {
		IsPrimeNumber_07 obj = new IsPrimeNumber_07();
		obj.checkPrimeNumber(2);
		obj.checkPrimeNumber(5);
		obj.checkPrimeNumber(10);
		obj.checkPrimeNumber(14);
		obj.checkPrimeNumber(25);
		obj.checkPrimeNumber(29);
	}

}
