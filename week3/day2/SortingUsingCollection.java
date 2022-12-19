package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingUsingCollection {

	public static void main(String[] args) {
		// Declare a String array and add the Strings values as (HCL, Wipro,  Aspire Systems, CTS)	
		
		String[] company = {"HCL", "Wipro",  "Aspire Systems", "CTS"};
		String output="";
		//Get the length of the array
		//Sort the array
		//To sort the array add the elements of String array to a List and then sort
		
		List<String> companyList = new ArrayList<String>();
		
		for(int i=0;i<company.length;i++)
			companyList.add(company[i]);
		
		//sort the values in the list
		Collections.sort(companyList);
		
		System.out.println(companyList);
		
		//Reverse the List and store it in output array
		for(int i=companyList.size()-1;i>=0;i--)
		{
			output=output+companyList.get(i)+" , ";
		}
		System.out.println(output);
		
		

	}

}
