import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class CalculateAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your birth year:");
        int birthYear = scanner.nextInt();
        System.out.println("Enter your birth month (1-12):");
        int birthMonth = scanner.nextInt();
        System.out.println("Enter your birth day (1-31):");
        int birthDay = scanner.nextInt();

        Calendar birthDate = Calendar.getInstance();
        birthDate.set(birthYear, birthMonth, birthDay);

        Date currentDate = new Date();
        Calendar currentCalendar = Calendar.getInstance();
        currentCalendar.setTime(currentDate);

        int age = currentCalendar.get(Calendar.YEAR) - birthDate.get(Calendar.YEAR);
        if (currentCalendar.get(Calendar.MONTH) < birthDate.get(Calendar.MONTH) ||
            (currentCalendar.get(Calendar.MONTH) == birthDate.get(Calendar.MONTH) &&
             currentCalendar.get(Calendar.DAY_OF_MONTH) < birthDate.get(Calendar.DAY_OF_MONTH))) {
            age--;
        }
        System.out.println("Your age is: " + age + " years");
    }
}
