package collectionframeworkinjava;

import java.util.LinkedList;
import java.util.List;


public class LinkedList_02 {

	public static void main(String[] args) {
		List<String> list = new LinkedList<String>();
		list.add("10");
		list.add("20");
		list.add("true");
		list.add("test");
		System.out.println(list);
		
		List<String> list1 = new LinkedList<String>();
		list1.add("10");
		list1.add("100");
		//System.out.println(list1);
		
		//list.addAll(list1);
		//list.add(2, "200");
		//list.retainAll(list1);
		//list.removeAll(list1);
		//System.out.println(list.get(2));
		//System.out.println(list.contains("10"));
		//System.out.println(list.contains(list1));
		System.out.println(list.size());
	}

}
