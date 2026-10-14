import java.util.Scanner;

public class Q09_LexicographicStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String first = sc.nextLine();
        System.out.print("Enter the second string: ");
        String second = sc.nextLine();

        int limit = Math.min(first.length(), second.length());
        int result = 0;

        for (int i = 0; i < limit; i++) {
            char a = first.charAt(i);
            char b = second.charAt(i);
            if (a < b) {
                result = -1;
                break;
            } else if (a > b) {
                result = 1;
                break;
            }
        }

        if (result == 0) {
            if (first.length() < second.length()) result = -1;
            else if (first.length() > second.length()) result = 1;
        }

        if (result < 0) System.out.println("First string comes before second string.");
        else if (result > 0) System.out.println("First string comes after second string.");
        else System.out.println("Both strings are equal.");
        sc.close();
    }
}
