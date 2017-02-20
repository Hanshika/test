import java.util.Scanner;


public class evenoddnumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=3;
	    System.out.println("Enter an Integer number:");

	    //The input provided by user is stored in num
	 //   Scanner input = new Scanner(System.in);
	//    num = input.nextInt();
    
	    /* If number is divisible by 2 then it's an even number
	     * else odd number*/
	    

	      if ( num% 2 == 0 )
	         System.out.println("You entered an even number.");
	      else
	         System.out.println("You entered an odd number.");
	   }
	}


