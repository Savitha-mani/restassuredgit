package javaprograms;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Testing";
		String s1=s.toLowerCase();
		char[] charArray=s1.toCharArray();
		HashMap<Character, Integer> map=new HashMap<Character, Integer>();
		for(char c:charArray) {
			
			map.put(c, map.getOrDefault(c, 0)+1);
			
		}
		for(Map.Entry<Character, Integer> entry:map.entrySet()) {
			if(entry.getValue()>1) {
				System.out.println("Duplicate character is: "+entry.getKey());
			}
		}
	}

}
