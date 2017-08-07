package collectionframeworkinjava;

import java.util.LinkedList;
import java.util.List;

public class LinkedList_01 {

	public static void main(String[] args) {
		List list = new LinkedList();
		
		list.add(10);
		list.add(10.00);
		list.add(true);
		list.add("test");
		System.out.println(list);
		
		List<Object> list1 = new LinkedList<Object>();
		list1.add(10);
		list1.add(10.00);
		list1.add(true);
		list1.add("test");
		System.out.println(list1);
	}

}
