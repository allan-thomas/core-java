package corejava;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarDemo {

	public static void main(String[] args) {


		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("M/d/yyy hh:mm:ss");
		
		Calendar calendar = Calendar.getInstance();
		
		System.out.println(simpleDateFormat.format(calendar.getTime()));
		
		System.out.println(calendar.get(Calendar.DAY_OF_MONTH));

		System.out.println(calendar.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		
		System.out.println(calendar.get(Calendar.AM_PM));
		
		System.out.println(calendar.get(Calendar.MINUTE));
	}

}
