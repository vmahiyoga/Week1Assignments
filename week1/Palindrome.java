package week1.assignments2;

public class Palindrome {

	public static void main(String[] args) {
		//Declare Input String
		String input = "Liril";
		//Declare output variable
		String reverse = "";
		
		//convert the input string to charArray
		char[] charArray = input.toCharArray();
		
		//Traverse through the string in reverse order and concatenate the chars in output variable
		for(int i=charArray.length-1;i>=0;i--)
		{
			reverse = reverse+charArray[i];
		}

		//print reverse string
		System.out.println(reverse);
		
		//Compare input and reverse string
		if(input.equalsIgnoreCase(reverse))
			System.out.println("The given input is Palindrome");
		else
			System.out.println("The given input is not Palindrome");
	}

}
