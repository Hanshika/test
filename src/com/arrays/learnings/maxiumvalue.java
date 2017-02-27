package com.arrays.learnings;

public class maxiumvalue {

	
	public static void main(String[] args) {
		double[] numbers = {28,50,67,79,80};

		double large =numbers[0];
		for (int i=0;i<numbers.length;i++){
			if(numbers[i] > large) {
				 large = numbers[i];
			}
		}
		System.out.println("maxium number is:"+large);
		}
	}


