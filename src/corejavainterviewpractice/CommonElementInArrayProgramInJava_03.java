package corejavainterviewpractice;

import java.util.HashSet;

public class CommonElementInArrayProgramInJava_03 {
	public static void main(String[] args) {
		int[] s1 = {2,3,4,5,6,7,6};
		 
        int[] s2 = {3,4,5,6,7,7,9};
 
        HashSet<Integer> set = new HashSet<Integer>();
 
        for (int i = 0; i < s1.length; i++)
        {
            for (int j = 0; j < s2.length; j++)
            {
                if(s1[i]==(s2[j]))
                {
                    set.add(s1[j]);
                }
            }
        }
 
        System.out.println(set);
    }
	}

