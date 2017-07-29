package methodOverLoading;

public class MethodOverLoading_01 {
	public void bmwModel() {
		System.out.println("2015 model has 2 feature which is new technology");
	}

	public void bmwModel(String a) {
		System.out.println("2015 model has 3 feature which is new technology");
	}

	public void bmwModel(String a, String b) {
		System.out.println("2015 model has 4 feature which is new technology");
	}

	public void bmwModel(String a, String b, String c) {
		System.out.println("2015 model has 5 feature which is new technology");
	}

	public static void main(String[] args) {
		MethodOverLoading_01 obj = new MethodOverLoading_01();

		obj.bmwModel();
		obj.bmwModel("2015");
		obj.bmwModel("2016","2016");
		obj.bmwModel("2017","2017","2017");
	}

}
