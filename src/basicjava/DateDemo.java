package basicjava;

import java.text.SimpleDateFormat;
import java.util.Date;



public class DateDemo {

	
	public static void main(String[] args) {
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("d/M/YYYY");
		SimpleDateFormat s = new SimpleDateFormat("d/M/YYYY hh:mm:ss");
		SimpleDateFormat sd = new SimpleDateFormat("hh:mm:ss");
		SimpleDateFormat df = new SimpleDateFormat("EE");
		//System.out.println(d.toString());
	System.out.println(sdf.format(d));
	System.out.println(sd.format(d));
System.out.println(df.format(d));
System.out.println(s.format(d));
	}

}
