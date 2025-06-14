import java.util.Scanner;

public class SwitchCaseSentence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Month number");
        int month = scanner.nextInt();
        System.out.println("Year number");
        int year = scanner.nextInt();

        switch (month) {
            case 1:
                System.out.println("Year: " + year + " Month: January Days: " + getDaysInMonth(month, year));
                break;
            case 2:
                System.out.println("Year: " + year + " Month: February Days: " + getDaysInMonth(month, year));
                break;
            case 3:
                System.out.println("Year: " + year + " Month: March Days: " + getDaysInMonth(month, year));
                break;
            case 4:
                System.out.println("Year: " + year + " Month: April Days: " + getDaysInMonth(month, year));
                break;
            case 5:
                System.out.println("Year: " + year + " Month: May Days: " + getDaysInMonth(month, year));
                break;
            case 6:
                System.out.println("Year: " + year + " Month: June Days: " + getDaysInMonth(month, year));
                break;
            case 7:
                System.out.println("Year: " + year + " Month: July Days: " + getDaysInMonth(month, year));
                break;
            case 8:
                System.out.println("Year: " + year + " Month: August Days: " + getDaysInMonth(month, year));
                break;
            case 9:
                System.out.println("Year: " + year + " Month: September Days: " + getDaysInMonth(month, year));
                break;
            case 10:
                System.out.println("Year: " + year + " Month: October Days: " + getDaysInMonth(month, year));
                break;
            case 11:
                System.out.println("Year: " + year + " Month: November Days: " + getDaysInMonth(month, year));
                break;
            case 12:
                System.out.println("Year: " + year + " Month: December Days: " + getDaysInMonth(month, year));
                break;
            default:
                System.out.println("Invalid month number. Please enter a number between 1 and 12.");
                break;
        }
    }

    public static Integer getDaysInMonth(int month, int year) {
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 2:
                return isLeapYear(year) ? 29 : 28;
            default:
                return null; // Invalid month
        }
    }

    public static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0;
            } else {
                return true;
            }
        } else {
            return false;
        }
    }
}
