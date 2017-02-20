import java.util.HashSet;
import java.util.Set;


public class repeatedstring {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 String g="hello";
	      int  count=0;
	   for(int i=g.length()-1;i>=0;i--){
	   if(g.charAt(i)=='l'|g.charAt(i)=='L' ){ //covert this into char array
	      
	       count=++count;  
	   }
	   }
	        System.out.println("no. of duplicate character"+count);
		
		
	/*	String g="hello";
	    
		
		Set<String> s= new HashSet<>();
		for(String k:g)
		{
		if(s.add(k)==false)
			System.out.println(k);
			
		}*/
		
		
		
		
		
		
		
		
		
	    }
		
		
		

	}


