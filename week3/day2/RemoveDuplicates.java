package collections;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// Declare input string
		String input = "PayPal India";
		String output="";
		input = input.replaceAll("\\s", ""); 

		//Convert it into a character array
		char[] inputChar = input.toCharArray();

		//Declare a Set as charSet for Character
		//Declare a Set as dupCharSet for duplicate Character

		Set<Character> charSet = new LinkedHashSet<Character>();
		Set<Character> dupCharSet = new LinkedHashSet<Character>();

		//Iterate character array and add it into charSet
		for(int i=0;i<inputChar.length;i++)
		{
			if(!charSet.add(inputChar[i]))
			{
				dupCharSet.add(inputChar[i]);
			}
				
		}

		System.out.println(charSet);
		System.out.println(dupCharSet);
		
		//Convert duplicate char set into list
		List<Character> dupCharList = new ArrayList<Character>(dupCharSet);
		
		//Check the dupCharSet elements and remove those in the charSet
		for(int i=0;i<dupCharList.size();i++)
		{
			charSet.remove(dupCharList.get(i));
		}
		System.out.println(charSet);
		
		for (Character character : charSet) {
			output = output+character;
		}
		
		System.out.println(output);
		

	}

}
