package org.sort.basics;

import java.util.Stack;

// removing the consequituve same characters by taking turns between A and B, the last to take the 
//consequitive charater wins 
public class WinnerAlgoritm {
	
	public static void findWinner(String s) {
		int i;
		int count=0, n;
		n = s.length();
		Stack<Character> st = new Stack<Character>(); 
		for(i=0; i<n;i++) {
			if(st.isEmpty() || st.peek() != s.charAt(i)) {
				st.push(s.charAt(i));
			}else {
				count++;
				st.pop();
			}
		}
		
		if (count % 2 == 0)  
	    { 
	        System.out.println("B"); 
	    }  
	    else
	    { 
	        System.out.println("A"); 
	    }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "kaak";
		findWinner(s);
	}

}
