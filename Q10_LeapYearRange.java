import java.util.Scanner;

public class Q10_LeapYearRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter year, range start, and range end: ");
        int year = sc.nextInt();
        int start = sc.nextInt();
        int end = sc.nextInt();

        boolean leap = (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
        boolean inRange = year >= start && year <= end;

        if (leap && inRange) {
            System.out.println(year + " is a leap year and is within the range.");
        } else {
            System.out.println(year + " does not satisfy both conditions.");
        }
        sc.close();
    }
}
