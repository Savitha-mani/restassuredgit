package javaprograms;

public class Largestnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {10,25,5,78,45,99,23};
		int largest=arr[0];
	for(int i=1;i<arr.length;i++) {
		if(arr[i]>largest) {
			largest=arr[i];
		}
	}
	System.out.println("Largest number is: "+largest);
}
}