package javaprograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FindDuplicateList {

	public static void main(String[] args) {
		int[] arr= {10,25,5,78,45,99,23,10,5,78};
		HashMap<Integer, Integer> map = new HashMap<>();
		ArrayList<Integer> duplicates = new ArrayList<>();
		for(int num :arr) {
			map.put(num, map.getOrDefault(num, 0)+1);
			
		}
		System.out.println(map);
	for(Map.Entry<Integer,Integer> entry:map.entrySet()) {
		if(entry.getValue()>1) {
			duplicates.add(entry.getKey());
		}
	}
	System.out.println(duplicates);
		

	}

}
