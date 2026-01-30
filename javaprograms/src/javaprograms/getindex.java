package javaprograms;

import java.util.ArrayList;

public class getindex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {10,25,5,78,45,99,23,78};
		int target=100;
		ArrayList<Integer> indices = new ArrayList<>();
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==target) {
				indices.add(i);
			}
		}
		if(indices.isEmpty()) {
			System.out.println("Target "+target+" not found in the array.");
		}
		else
		System.out.println("Indices of target "+target+" are: "+indices);
	}

}
