import java.util.Scanner;

public class Q20_PasswordDoWhile {
    public static void main(String[] args) {
        final String correctPassword = "java123";
        Scanner sc = new Scanner(System.in);
        String entered;

        do {
            System.out.print("Enter password: ");
            entered = sc.nextLine();
            if (!entered.equals(correctPassword)) {
                System.out.println("Incorrect password. Try again.");
            }
        } while (!entered.equals(correctPassword));

        System.out.println("Access granted.");
        sc.close();
    }
}
