package week1.assignments2;

public class ReverseEvenWords {

	public static void main(String[] args) {
		//Declare input String
		String input = "I am an automation tester";
		String reverse ;
		
		//Split the words in the String and place it in an array
		String[] words = input.split(" ");
		
		//Traverse through each word and if the index is odd (even word), then reverse the characters in the word
		for(int i=0;i<words.length;i++)
		{
			//check if the index is odd
			if(i%2!=0)
			{
				//Place the even word in a temporary String variable reverse
				reverse = words[i];
				//convert the String reverse to charArray
				char[] charArray = reverse.toCharArray();
				reverse = "";
				//Traverse through the charArray from end and store the chars in reverse order
				for(int j=charArray.length-1;j>=0;j--)
					reverse = reverse+charArray[j];
				//Place the reversed word in the String Array
				words[i]=reverse;
				
			}//end of if statement
			//Print the string array
			System.out.print(words[i]+" ");
		}//end of for loop

	}

}
