package javaprograms;

public class secondlargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {10,25,5,78,45,99,23};
		int largest=arr[0];
		int secondlargest=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>largest) {
				secondlargest=largest;
				largest=arr[i];
			
			}
			
		}
		System.out.println("Largest number is: "+largest);
		System.out.println("Largest number is: "+secondlargest);
	}

}
