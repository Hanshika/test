package com.arrays.learnings;

public class missingnumber {


	public static void main(String[] args) {
		int number[]={1,2,3,5,6,7,8,9,10,13};	
		int k =number[0];
		for (int i=0;i<number.length;i++){
			if(k==number[i])
       {
				k++;
				continue;
			}
			else{
				System.out.println("missing numbers are "+k);
			}
		}
	
			
		}

	}


