
public class leaderelements {

	void printLeaders(int arr[], int size) 
	    {
		
			for (int i = 0; i < size; i++) 
			{
				int j;
				for (j = i + 1; j < size; j++) 
				{
					if (arr[i] <= arr[j])
						break;
				}
				if (j == size) // the loop didn't break
					System.out.print(arr[i] + " ");
			}
		}
	

		public static void main(String[] args) {
			leaderelements lead = new leaderelements();
			int arr[] = new int[]{6,9,15,1,11,3,10};
			int n = arr.length;
			  lead.printLeaders(arr, n);
		}
}
//The element which is greater than the elements to its right.