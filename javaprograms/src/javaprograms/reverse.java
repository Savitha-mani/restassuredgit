package javaprograms;

public class reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="Savitha";
	/*	StringBuilder sb=new StringBuilder(name);
		sb.reverse();
		System.out.println(sb.toString());*/
		
		char[] cha=name.toCharArray();
		for(int i=cha.length-1;i>=0;i--) {
			System.out.print(cha[i]);
		}

	}

}
