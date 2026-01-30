package javaprograms;

public class minnuminarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]= {{3,4,5},{6,7,8},{0,2,3}};
		int max=0;
		int min=a[0][0];
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[0].length;j++) {
				//System.out.println(a[i][j]);
				if(a[i][j]<min) {
					min=a[i][j];
					System.out.println(i);
					for(int k=0;k<a[0].length;k++) {
						if(a[i][k]>max) {
							max=a[i][k];
							
						}
					}
				}
			}
			
		}
		System.out.println(min);
		System.out.println(max);
	}

}
