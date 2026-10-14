import java.util.Scanner;

public class Q06_HalvingSteps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        double number = sc.nextDouble();

        if (number <= 0) {
            System.out.println("Please enter a number greater than 0.");
        } else {
            int steps = 0;
            while (number >= 1) {
                number /= 2;
                steps++;
            }
            System.out.println("Steps until number is less than 1 = " + steps);
        }
        sc.close();
    }
}
