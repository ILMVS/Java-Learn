import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class JavaUtilCalendar {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        //set timezone if needed
        calendar.setTimeZone(TimeZone.getTimeZone("GMT")); // Uncomment to set a specific timezone

        calendar.set(Calendar.YEAR, 2023);
        calendar.set(Calendar.MONTH, Calendar.OCTOBER); // Months are 0-based in Calendar
        calendar.set(Calendar.DAY_OF_MONTH, 15);
        //calendar.set(Calendar.HOUR_OF_DAY, 10);
        calendar.set(Calendar.HOUR, 10);
        calendar.set(Calendar.AM_PM, Calendar.PM);
        calendar.set(Calendar.MINUTE, 30);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);

        Date currentDate = calendar.getTime();
        System.out.println("Current Date and Time: " + currentDate);

        SimpleDateFormat df = new SimpleDateFormat("EEEE dd/MMMM/yyyy HH:mm:ss");
        String formattedDate = df.format(currentDate);
        System.out.println("Formatted Date: " + formattedDate);

        //print TimeStamp
        long timestamp = currentDate.getTime();
        System.out.println("Timestamp: " + timestamp);

        String dateString = "Sunday 15/October/2023 16:30:00";
        try {
            Date parsedDate = df.parse(dateString);
            System.out.println("Parsed Date: " + parsedDate);
        } catch (Exception e) {
            System.out.println("Error parsing date: " + e.getMessage());
        }

        //compare 2 dates
        Calendar calendar2 = Calendar.getInstance();
        calendar2.set(2023, Calendar.OCTOBER, 16, 10, 30, 0);
        Date dateToCompare = calendar2.getTime();

        if (currentDate.before(dateToCompare)) {
            System.out.println("Current date is before the date to compare.");
        } else if (currentDate.after(dateToCompare)) {
            System.out.println("Current date is after the date to compare.");
        } else {
            System.out.println("Current date is equal to the date to compare.");
        }
        //compare 2 dates using Calendar
        if(currentDate.compareTo(dateToCompare)> 0) {
            System.out.println("Current date is after the date to compare using compareTo.");
        } else if(currentDate.compareTo(dateToCompare) < 0) {
            System.out.println("Current date is before the date to compare using compareTo.");
        } else if(currentDate.compareTo(dateToCompare) == 0) {
            System.out.println("Current date is equal to the date to compare using compareTo.");
        }
    }
}
