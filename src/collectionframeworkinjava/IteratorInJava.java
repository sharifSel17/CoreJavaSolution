package collectionframeworkinjava;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class IteratorInJava {
	public static void main(String[] args) {
		List<Object> list = new LinkedList<Object>();
		list.add("10");
		list.add("20");
		list.add("true");
		list.add("test");
		System.out.println(list);
		
		Iterator<Object> ite = list.iterator();
		while(ite.hasNext()){
			System.out.println(ite.next());
			 ite.remove();
		}
		System.out.println(list);
		
		System.out.println("===========");
		
		List<Object> list1 = new LinkedList<Object>();
		list1.add("10");
		list1.add("20");
		list1.add("true");
		list1.add("test");
		//System.out.println(list1);
		
		ListIterator<Object> ite1 = list1.listIterator();
		while(ite1.hasNext()){
			System.out.println(ite1.next());
		}
		while(ite1.hasPrevious()){
			System.out.println(ite1.previous());
		}
		
	}
}  
