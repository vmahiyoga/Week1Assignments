package week1.assignments2;

public class RemoveDuplicateWords {

	public static void main(String[] args) {
		String text = "we learn java basics as part of java sessions in java week1";
		String[] words = text.split(" ");
		
		for(int i=0;i<words.length;i++)
		{
			for(int j=i+1;j<words.length;j++)
			{
			//System.out.println(words[i]+" "+words[j]);
			if(words[i].equals(words[j]))
			{
				words[j] = "";
			}
			}
		}
		
		for(int i=0;i<words.length;i++) {
			System.out.print(words[i]+" ");
		}
			
		

	}

}
