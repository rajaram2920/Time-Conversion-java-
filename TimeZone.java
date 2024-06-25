
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class TimeZonee {

	public static void main(String[] args) {
		String format = "dd-M-yyyy hh:mm:ss a";
       
		SimpleDateFormat dateFormat = new SimpleDateFormat(format);
		
		Date dt = new Date();
		
		String defaultZ = TimeZone.getDefault().getID();
		
		System.out.println(dt);
		
		System.out.println(defaultZ);
		
		Calendar cal = new GregorianCalendar();
		cal.setTime(dt);
		
		System.out.println(dateFormat.format(cal.getTime()));
		System.out.println(cal.getTimeZone().getID());
		System.out.println(cal.getTimeZone().getDisplayName());
		
		
		TimeZone af = TimeZone.getTimeZone("Australia/Victoria");
		SimpleDateFormat afDateFormat = new SimpleDateFormat(format);
		
		
		afDateFormat.setTimeZone(af);
		cal.setTimeZone(af);
		
		
		System.out.println("After conversion  ");
		
        System.out.println(afDateFormat.format(cal.getTime()));
		System.out.println(cal.getTimeZone().getID());
		System.out.println(cal.getTimeZone().getDisplayName());
		
	}

}
