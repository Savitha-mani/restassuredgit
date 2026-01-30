package javaprograms;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Dateclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("MM-dd-yy");
		System.out.println(sdf.format(date));
		
		Calendar cal=Calendar.getInstance();
		System.out.println(cal.get(Calendar.DATE));
		

	}

}
