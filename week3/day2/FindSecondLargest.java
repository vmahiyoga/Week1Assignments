package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FindSecondLargest {

	public static void main(String[] args) {
		//Input interger array
		int[] data = {3,2,11,4,6,7,2,3,3,6,7};
		
		//Create a empty set using tree set
		Set<Integer> inputSet = new TreeSet<Integer>();
		
		//Declare for loop iterator from 0 to data.length and add into Set 
		//Set is created and input integer array is inserted into Set to eliminate duplicates
		
		for(int i=0;i<data.length;i++)
		{
			inputSet.add(data[i]);
		}

		System.out.println(inputSet);
		
		//Create a ArrayList and Convert the Set into List
		//Set is converted into list, to select the second element from last, (as we dont have get() in Set)
		
		List<Integer> inputList = new ArrayList<Integer>(inputSet);
		
		//Print the second last element from List
		int size = inputList.size();
		System.out.println("Second Largest Number: "+inputList.get(size-2));
				
	}

}
