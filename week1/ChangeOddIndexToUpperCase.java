package week1.assignments2;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		//Input & Output Variables
		String company = "nielsen";
		
		//Output: nIeLsEn
		
		String result = "";
		
		//Convert the String to a char array
		char[] charArray = company.toCharArray();
		
		//Traverse through each character using for loop
		for (int i = 0; i < charArray.length; i++)
		{
			//check the index value is odd
			if(i%2==1)
			{
				// if the index is odd, change the character to Uppercase
				charArray[i] = Character.toUpperCase(charArray[i]);
				
				//Concatenate the chars in the charArray to result
				result = result+charArray[i];			
			}
			
			else
			{
				// if the index is even, Concatenate the character to result
				result = result+charArray[i];
			}
		}
		
		System.out.println(result);

	}

}
