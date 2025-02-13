import java.util.Scanner;
public class LeapYearCalculator {

    public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
    	int test1 = scan.nextInt();
        boolean test = isLeapYear(test1);

        System.out.println(test);

    }

    public static boolean isLeapYear(int year) {
        boolean leapYear = true;
        if (year >= 1 && year <= 9999) {
            if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                return true;
            }
        } else if (year < 0 && year > 9999) {
            return leapYear;
        }

        return false;
    }
}

