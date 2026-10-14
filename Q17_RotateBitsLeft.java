import java.util.Scanner;

public class Q17_RotateBitsLeft {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = sc.nextInt();

        int rotated = (number << 2) | (number >>> 30);
        System.out.println("After rotating bits left by 2 = " + rotated);
        System.out.printf("Binary result = %32s%n", Integer.toBinaryString(rotated));
        sc.close();
    }
}
