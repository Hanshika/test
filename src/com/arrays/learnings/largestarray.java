package com.arrays.learnings;

public class largestarray {

	
	public static void main(String[] args) {
		int[] numbers = {2,5,6,7,8};

		int large =numbers[0];
		for (int i=0;i<numbers.length;i++){
			if(numbers[i] > large) {
				 large = numbers[i];
			}
		}
		System.out.println("largest number is:"+large);
		}
	}


