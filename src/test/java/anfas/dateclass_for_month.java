package anfas;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class dateclass_for_month 

{
	
	
	public String getFormattedDateCurrentMonth(String dateFormat) {
	    Date currentDate = new Date(); // Today's date
	    Calendar calendar = Calendar.getInstance();
	    calendar.setTime(currentDate); // Set calendar to today's date
	    calendar.add(Calendar.MONTH, 0); // Add 1 month

	    Date targetDate = calendar.getTime();
	    SimpleDateFormat simpleDateFormat = new SimpleDateFormat(dateFormat);
	    return simpleDateFormat.format(targetDate); // Return formatted date
	}
	
	
	
	public String getFormattedDateNextMonth(String dateFormat) {
	    Date currentDate = new Date(); // Today's date
	    Calendar calendar = Calendar.getInstance();
	    calendar.setTime(currentDate); // Set calendar to today's date
	    calendar.add(Calendar.MONTH, 2); // Add 1 month

	    Date targetDate = calendar.getTime();
	    SimpleDateFormat simpleDateFormat = new SimpleDateFormat(dateFormat);
	    return simpleDateFormat.format(targetDate); // Return formatted date
	}

}
