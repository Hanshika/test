
public class smallestaray {

public static void main(String[] args) {
	int[] numbers = {-2,5,6,7,8};

int small =numbers[0];
for (int i=0;i<numbers.length;i++){
	if(numbers[i] < small) {
		 small = numbers[i];
	}
}
System.out.println("smallest number is:"+small);
}
}