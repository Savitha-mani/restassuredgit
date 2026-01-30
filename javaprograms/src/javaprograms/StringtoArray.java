package javaprograms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class StringtoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="Savitha";
		char[] charArray=name.toCharArray();
		ArrayList<Character> list=new ArrayList<Character>();
		for(char c:charArray) {
			list.add(c);
		}	
		System.out.println(list);
		LinkedHashSet<Character> set=new LinkedHashSet<Character>(list);
		System.out.println(set);
	}

}
