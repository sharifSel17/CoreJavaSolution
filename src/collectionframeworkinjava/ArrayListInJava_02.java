 package collectionframeworkinjava;


import java.util.ArrayList;
import java.util.List;

public class ArrayListInJava_02 {
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		//System.out.println(list);
		
		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(10);
		list1.add(20);
		list1.add(30);
		list1.add(40);
		//System.out.println(list1);
		
		//list.addAll(list1);
		//list.add(2, 200);
		//System.out.println(list);
		
		//list.removeAll(list1);
		list.remove(2);
		System.out.println(list);
		
	}
}
