package misc;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;


public class main_misc {
    //private static HashMap<String,String> cache = new HashMap<>();
	public static void main(String[] args) {
	   
	  String s = "Tact Coa";
	  System.out.println(palindrome_permutation(s));
		
		
	}
	/*
	 * If all characters appear an even number of times,then is obvious that i can find a permutation of s that is a palindrome
	 * Now if just one character appears an odd number of times i can still form a palindrome,because i can use this character as
	 * a mirror,but if i have more than 1 char appearing odd number of times i cant do this anymore.
	 */
	private static int palindrome_permutation(String s) {
		//
		HashMap<String,Integer> h = new HashMap<>();
		
		s = s.toLowerCase();
		
		for(int i = 0;i < s.length();i++){
			String x = s.substring(i,i+1);
			if(x.equals(" ")) {
				continue;
			}
			if(h.containsKey(x)) {
				h.replace(x,h.get(x)+1);
			}
			else {
				h.put(x,1);
			}
		}
		
	    int count = 0;
		for(int i = 0;i < s.length();i++) {
			String x = s.substring(i, i+1);
			if(x.equals(" ")) {
				continue;
			}
			if( h.get(x) % 2 != 0) {
				count++;
				if(count >= 2) {
					return 0;
				}
				
			}
		}
		
		return 1;
	}
		
	
	}
	
		
		
	

	
	
	
	
	
	
	
	
	

	


	
	

	
		
	
	


	

	
	


	
	
	

	


	
	

	
		
	
	


	

	
	

