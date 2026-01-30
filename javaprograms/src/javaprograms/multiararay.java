package javaprograms;

public class multiararay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[][]= {{3,4,5},{6,7,8}};
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[0].length;j++) {
				System.out.print(a[i][j]);
			}
			System.out.println(" ");
		}
	}

}
