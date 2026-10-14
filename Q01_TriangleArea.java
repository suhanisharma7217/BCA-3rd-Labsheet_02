import java.util.Scanner;

public class Q01_TriangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the three sides: ");
        double a = sc.nextDouble(), b = sc.nextDouble(), c = sc.nextDouble();

        if (a <= 0 || b <= 0 || c <= 0 || a + b <= c || a + c <= b || b + c <= a) {
            System.out.println("Invalid triangle sides.");
        } else {
            double s = (a + b + c) / 2.0;
            double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
            System.out.printf("Area of triangle = %.2f%n", area);
        }
        sc.close();
    }
}
