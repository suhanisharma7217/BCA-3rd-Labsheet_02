import java.util.Scanner;

public class Q30_MixedAdvanced {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
            sc.close();
            return;
        }

        int shifted = number;
        while (shifted > 1 && (shifted & 3) == 0) {
            shifted >>= 2;
        }
        boolean powerOfFour = shifted == 1;
        System.out.println(number + (powerOfFour ? " is" : " is not") + " a power of 4.");

        int toggled = number ^ (1 << 2);
        System.out.println("After toggling the 3rd bit = " + toggled);

        System.out.println("Multiplication table (skip multiples of 6; stop at multiples of 48):");
        for (int i = 1; i <= 12; i++) {
            int product = number * i;
            if (product % 48 == 0) break;
            if (product % 6 == 0) continue;
            System.out.println(number + " x " + i + " = " + product);
        }
        sc.close();
    }
}
