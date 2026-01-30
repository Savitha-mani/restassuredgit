package javaprograms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class uniquenumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers= {1,2,3,2,4,5,1,6,4};
		
		HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
		for(int num:numbers) {
			map.put(num, map.getOrDefault(num, 0)+1);
			
		}
		System.out.println(map);
		for(Map.Entry<Integer, Integer> entry:map.entrySet()) {
			if(entry.getValue()==1) {
				System.out.println("Unique number is: "+entry.getKey());
			}
		}
		

}
}
