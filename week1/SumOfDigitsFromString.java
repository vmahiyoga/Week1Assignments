package week1.assignments2;

public class SumOfDigitsFromString {

	public static void main(String[] args) {

		//Sum of digits from the input String
		//Declare input

		String input = "Date17Month08Year1989";

		//Declare integer sum = 0, to store the sum of digits value
		int sum = 0;

		//Convert the string to charArray
		char[] charArray = input.toCharArray();


		//Traverse through a loop to check each and every character in charArray
		for(int i=0;i<input.length();i++)
		{
			//If the character is a number, then get the numeric value of the character and add it to sum

			if(Character.isDigit(charArray[i]))
			{
				//System.out.print("char: "+charArray[i]);
				sum = sum+Character.getNumericValue(charArray[i]);

				//System.out.println("sum:"+sum);
			}

		}
		System.out.println("Sum of characters in the input: "+sum);
	}

}


