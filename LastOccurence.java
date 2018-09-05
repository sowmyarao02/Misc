package Misc;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

public class LastOccurence {

	public static void main(String[] args) {

	//	Integer[] lo = {1,5,5,1,6,1};
	//	Integer[] lo = {2, 5, 5, 5};
		Integer[] lo = {2, 5, 5, 2};
		
		Set<Integer> s = new HashSet<Integer>();
		Stack<Integer> hi = new Stack<Integer>();
		
		for(int i=0;i<lo.length;i++) {
			
			if(s.contains(lo[i])==true){
				hi.remove(lo[i]);
				hi.push(lo[i]);
			}
			else {
				s.add(lo[i]);
				hi.push(lo[i]);
			}
				
		}	
		
		System.out.println("The elements that occured last are - ");
		
		while(hi.size()>0) {
			System.out.print(" "+hi.pop());
		}
		
	}

}
