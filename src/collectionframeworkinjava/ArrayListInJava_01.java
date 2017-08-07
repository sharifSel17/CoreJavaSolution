 package collectionframeworkinjava;


import java.util.ArrayList;
import java.util.List;

public class ArrayListInJava_01 {
	public static void main(String[] args) {
		List arrayList = new ArrayList();
		
		arrayList.add(10);
		arrayList.add(10.00);
		arrayList.add(1010);
		arrayList.add(true);
		arrayList.add("sharif");
		arrayList.add(10);
		
		System.out.println(arrayList);
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(100);
		
		System.out.println(list);
	}
}
