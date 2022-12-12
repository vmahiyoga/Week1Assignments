package week1.assignments2;

public class FindIntersection {

	public static void main(String[] args) {
		
		//Declare 2 input arrays
		int[] set1 = {3,2,11,4,6,7};
		int[] set2 = {1,2,8,4,9,7};
		//int[] intersectionSet = {};
		
		//Traverse through first set using for loop
		for(int i=0;i<set1.length;i++)
		{
			//Traverse through second set using for loop
			for(int j=0;j<set2.length;j++)
			{
				//Compare both the sets, if the number matches print the number
				if(set1[i] == set2[j])
				{
					//intersectionSet[i] = set1[i];
					System.out.println(set1[i]);
				}
			}
		}
		
	}

}
