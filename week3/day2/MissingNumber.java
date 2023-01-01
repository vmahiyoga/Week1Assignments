package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingNumber {
	/* Problem 
	 * 
	 * There will be running number between 1 to 10
	 * One of the unique number will be missing
	 * Find the missing number
	 */

	public static void main(String[] args) {
		
		//input number from 1 to 10
		int[] nums = {1,3,2,4,6,5,8,10,9};
		
		//Insert the numbers into List and maintain in ascending order
		List<Integer> list = new ArrayList<Integer>();
		
		for(int i=0;i<nums.length;i++)
		{
			list.add(nums[i]);
		}
		//Sort the numbers in ArrayList
		Collections.sort(list);
		
		System.out.println("Input List: "+list);
		
		//Iterate from the starting number and verify the next number is + 1
		for(int i=0;i<list.size()-1;i++)
		{
			int num1= list.get(i);
			int num2= list.get(i+1);
			if(num2!=num1+1)
			{
				System.out.println("Missing number is: "+(num1+1));
			}
		}

	}

}
