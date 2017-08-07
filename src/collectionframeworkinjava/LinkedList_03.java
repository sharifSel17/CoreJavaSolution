package collectionframeworkinjava;

import java.util.LinkedList;
import java.util.List;


public class LinkedList_03 {

	public static void main(String[] args) {
		List<String> list = new LinkedList<String>();
		list.add("10");
		list.add("20");
		list.add("true");
		list.add("test");
		System.out.println(list);
		
		//list.clear();
		System.out.println(list);
		System.out.println(list.isEmpty());
		
		List<String> list1 = new LinkedList<String>();
		list1.add("10");
		list1.add("20");
		list1.add("true");
		list1.add("test");
		
		System.out.println(list);
	}

}
