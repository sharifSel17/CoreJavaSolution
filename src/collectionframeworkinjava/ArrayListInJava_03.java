 package collectionframeworkinjava;


import java.util.ArrayList;
import java.util.List;

public class ArrayListInJava_03 {
	public static void main(String[] args) {
		
		List<Object> list = new ArrayList<Object>();
		list.add(10);
		list.add(20.00);
		list.add(true);
		list.add("test");
		System.out.println(list);
		
		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(10);
		list1.add(20);
		list1.add(30);
		list1.add(40);
		
		//list.retainAll(list1);
		//System.out.println(list.size());
		//System.out.println(list.get(3));
		System.out.println(list.contains(100));
		//System.out.println(list);
		
	}
}
