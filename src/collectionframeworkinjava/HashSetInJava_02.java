package collectionframeworkinjava;

import java.util.HashSet;
import java.util.Set;

public class HashSetInJava_02 {

	public static void main(String[] args) {
		
		
		Set<Object> hash1 = new HashSet<Object>();
		hash1.add(1);
		hash1.add(2);
		hash1.add(3);
		System.out.println(hash1);
		
		HashSet<Integer> hash2 = new HashSet<Integer>();
		hash2.add(11);
		hash2.add(12);
		hash2.add(22);
		hash2.add(33);
		System.out.println(hash2);
		
		hash1.addAll(hash2);
		System.out.println(hash1);
	}

}
