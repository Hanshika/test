import java.util.Scanner;


public class sumofnumbers {

	public static void main(String[] args) {
	int n=20;
	int sum=0;
	for(int i=2;i<=n;i++)
	{
		if(i%2==0)
			sum=sum+i;
			}
	
	
	System.out.println("sum of nos is"+sum);
}
}

		/*int limit, sum = 0, count;
        System.out.println("\nEnter The Limit");
        Scanner sc = new Scanner(System.in);
        limit = sc.nextInt();
        for(count = 0; count <= limit; count++)
        {       
            if(count%2 == 0)
                sum = sum + count;
            else
                continue;
        }
        System.out.println("\nSum of Even Numbers: " + sum);
    }
	*/




