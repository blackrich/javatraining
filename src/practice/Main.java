package practice;

import java.util.Calendar;

public class Main {
	public static void main(String[] args) {
		
		_Calendar _cal = new _Calendar();
		_cal._Calendar();

		
	}
}
class _Calendar{
	public void _Calendar(){
//		System.out.println(cal);
		Calendar cal = Calendar.getInstance();
		System.out.println("year: " + cal.get(Calendar.YEAR));
		System.out.println("month: " + cal.get(Calendar.MONTH)+1);
		System.out.println("date: " + cal.get(Calendar.DATE));
		System.out.println("day of month: " + cal.get(Calendar.DAY_OF_MONTH));
		System.out.println("day of week: " + cal.get(Calendar.DAY_OF_WEEK));
		System.out.println("day of week in month: " + cal.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		System.out.println("day of year: " + cal.get(Calendar.DAY_OF_YEAR));
		System.out.println("hour: " + cal.get(Calendar.HOUR));
		System.out.println("hour of day: " + cal.get(Calendar.HOUR_OF_DAY));
		System.out.println("minute: " + cal.get(Calendar.MINUTE));
		System.out.println("second: " + cal.get(Calendar.SECOND));
	}
	
}