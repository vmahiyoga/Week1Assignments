package collections;

import java.util.Map;
import java.util.TreeMap;

public class FindNumberOfOccurances {

	public static void main(String[] args) {
		int[]  input = {2,3,5,6,3,2,1,4,2,1,6,-1};
		
		//Create TreeMap

		Map<Integer, Integer> map = new TreeMap<Integer,Integer>();

		for(int i=0;i<input.length;i++)
		{
			//Before adding a number to a Map, check whether number is available in the Map or not
			
			if(map.containsKey(input[i]))
			{
				//if the key value already present, get the value and increase it by 1
				int count = map.get(input[i]);	
				map.put(input[i], count+1);			
			}
			else
			{
				//else if the key value is not present in the map already, add the key(char) and value as 1 to the map
				map.put(input[i], 1);
			}
		}
		System.out.println(map);

	}

}
