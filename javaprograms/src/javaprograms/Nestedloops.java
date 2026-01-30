package javaprograms;

public class Nestedloops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nextsum=1;
		int total=10;
		for(int i=4;i>=1;i--) {
			
			for(int j=1;j<=i && nextsum<=total;j++) {
				System.out.print(nextsum);
				nextsum++;
				
			}
			System.out.println(" ");
		}
	}

}
