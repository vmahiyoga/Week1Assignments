package week1.assignments2;
import java.util.Arrays;
public class MissingElementInAnArray {
	public static void main(String[] args) {
		//Input Int array
		int[] arr = {1,3,4,7,6,2,8};
				
		//Sort the array
		Arrays.sort(arr);
		
		//loop through the array till the length of the array
		for(int i=1; i<=arr.length; i++)
		{
			//check if the iterator value is not equal to array value
			if(i!=arr[i-1])
			{
				//Print the number
				System.out.println(i);	
				break;
			}	
		}
	}
}
