package week1.assignments2;

public class PrintDuplicateInArray {

	public static void main(String[] args) {
		int[] array = {14,12,13,11,15,14,18,16,17,19,18,17,20};

		System.out.println("Duplicate values in Array:");
		//traverse through the array
		for(int i=0;i<array.length;i++)
		{
			//Traverse through the array from i+1 position 
			for(int j=i+1;j<array.length-1;j++)
			{
				//compare both the loop variables and check they are equal
				if(array[i]== array[j])
				{
					//Print the matching value
					System.out.println(array[j]);
				}//end of if loop
			}//end of inner for loop
		}//end of outer for loop
	}//end of main method
}//end of class
