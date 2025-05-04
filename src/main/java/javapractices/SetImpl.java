package javapractices;

import java.util.HashSet;
import java.util.Set;

public class SetImpl {
	
	/*
	 1. Set is the child interface of the collection interface
	 2. set doesn't allow duplicate insertion 
	 3. most of the set classes doesn't follow insertion order of the collection. 
	 */
	

	public static void main(String[] args) {
		
		Set<Integer> s1 = new HashSet<Integer>();
		s1. add(20);
		s1. add(50);
		s1. add(70);
		s1. add(null);
		
		for(Integer integer : s1) {
			System.out.println(integer);
		}
		

	}

}
