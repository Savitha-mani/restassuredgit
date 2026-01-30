package javaprograms;

import java.util.HashMap;
import java.util.Map;

public class firstnonrepeatingchar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="swiss";
		char[] charArray=name.toCharArray();
		HashMap<Character, Integer> map=new HashMap<Character, Integer>();
		for(char c:charArray) {
			map.put(c, map.getOrDefault(c, 0)+1);
		}
		System.out.println(map);
		for(Map.Entry<Character, Integer> entry:map.entrySet()) {
			if(entry.getValue()==1) {
				System.out.println("First non-repeating character is: "+entry.getKey());
				break;
			}
		}
		
	}

}
