package collections;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicatesWords {

	public static void main(String[] args) {
		//Use the declared String text as input
		String text = "We learn java basics as part of java sessions in java week1";

		//Split the String based on white spaces and save as String Array ,Then iterate the Array	
		String[] words = text.split(" ");

		//Create a empty Set
		Set<String> inputSet = new LinkedHashSet<String>(); 

		//Iterate the String array and add each word into Set
		for(int i=0;i<words.length;i++)
		{
			inputSet.add(words[i]);
		}
		//Print the Set
		System.out.println(inputSet);

		//Print output: Method 1: using String.join

		String result = String.join(" ", inputSet);
		System.out.println(result);

		//Print output: Method 2:
		//Convert Set into List
		List<String> outputList = new ArrayList<String>(inputSet);
		for(int i=0;i<inputSet.size();i++)
			System.out.print(outputList.get(i)+" ");
	}

}
