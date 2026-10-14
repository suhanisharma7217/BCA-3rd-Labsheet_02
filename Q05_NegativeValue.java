import java.util.Scanner;

public class Q05_NegativeValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = sc.nextInt();
        System.out.println("Negative value = " + (-number));
        sc.close();
    }
}
