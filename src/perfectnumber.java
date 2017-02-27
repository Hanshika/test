import java.util.Scanner;


public class perfectnumber {
	 public static void main(String a[]){
		 int n, temp = 0;
	    	Scanner s = new Scanner(System.in);
	        System.out.print("Enter number to check :");
	        n = s.nextInt();
         
	       
	        for(int i=1;i<=n/2;i++){
	            if(n%i == 0){
	                temp += i;
	            }
	        }
	        if(temp == n){
	            System.out.println("It is a perfect number");
	           
	        } else {
	            System.out.println("It is not a perfect number");
	         
	        }
	    }
	     
	   
	    }
	

