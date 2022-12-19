package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PrintUniqueCharacter {

	public static void main(String[] args) {
		//Use the declared String text as input
		String name = "maheshwari";
		
		// Convert String to Character array
		char[] charArray = name.toCharArray();
		
		//Create a new Set -> HashSet
		Set<Character> charSet = new HashSet<Character>();
		//Add each character to the Set 
		for(int i=0;i<charArray.length;i++)
		{
			//if it is already there, remove it
			if(!charSet.add(charArray[i]))
			{
				charSet.remove(charArray[i]);
			}
			
		}
		//Print the set
		System.out.println(charSet);
		
		//Convert the Set to List
		List<Character> charList = new ArrayList<Character>(charSet);
		for(int i=0;i<charSet.size();i++)
			System.out.print(charList.get(i)+" ");
	}
}
