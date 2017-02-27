package com.arrays.learnings;

public class duplicatearray {

	public static void main(String[] args) {
		int names[]={1,2,3,3,4,5};

		for (int i = 0; i < names.length; i++) {
		     for (int j = i + 1 ; j < names.length; j++) {
		    	 if (names[i]==names[j]) {
		        	  System.out.println("Duplicate Element is : "+names[j]);  
		                   // got the duplicate element
		          }
		     }
		 }

	}

}
