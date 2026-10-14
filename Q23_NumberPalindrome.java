import java.util.Scanner;

public class Q23_NumberPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = sc.nextInt();

        if (number < 0) {
            System.out.println("Negative numbers are not palindromes here.");
        } else {
            int original = number;
            int reversed = 0;
            while (number != 0) {
                reversed = reversed * 10 + number % 10;
                number /= 10;
            }
            if (original == reversed) System.out.println("The number is a palindrome.");
            else System.out.println("The number is not a palindrome.");
        }
        sc.close();
    }
}
