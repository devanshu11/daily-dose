package solutin3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Anagrams {
	
    static int makeAnagram(String a, String b) {
    	int count=0;
    	List<Character> l1 = new ArrayList<>(); 
    	List<Character> l2 = new ArrayList<>(); 
    	List<Character> l3 = new ArrayList<>(); 
    	char[] a2=a.toCharArray();
    	char[] b2=b.toCharArray();
    	for (Character c : b2) {
    		l1.add(c);
			
		}
    	for (Character d : a2) {
    		l2.add(d);
			
		}
     	for(Character h : l1) {
    		if((l2.contains(h)) && !(l3.contains(h)))
    		{ 
    			int a1=Collections.frequency(l1, h);
    			int b1=Collections.frequency(l2, h);
    			l3.add(h);
    			count+=(a1<=b1?a1:b1);
    			
    		}
    		
    	}
    	
    	return ((a.length()-count) + (b.length()-count));



    }

	public static void main(String[] args) {
        String a ="cde";

        String b ="abc";

        int res = makeAnagram(a, b);
        System.out.println(res);

	}

}
