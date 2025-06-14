import java.text.SimpleDateFormat;
import java.util.Date;

public class JavaUtilDateExample {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println("Current Date: " + date);

        SimpleDateFormat df = new SimpleDateFormat("EEEE dd/MMMM/yyyy HH:mm:ss");
        String formatedDate = df.format(date);
        System.out.println("Formatted Date: " + formatedDate);

        long j = 0;
        for(int i = 0; i < 10000000; i++) {
            j+=i;
        }
        Date date2 = new Date();

        System.out.println("Time taken to execute loop: " + (date2.getTime() - date.getTime()) + " milliseconds");

    }
}
