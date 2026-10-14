import java.util.Random;

public class Q29_RandomUntil91 {
    public static void main(String[] args) {
        Random random = new Random();
        int number;
        int count = 0;

        do {
            number = random.nextInt(100) + 1;
            count++;
            System.out.println("Generated: " + number);
            if (number % 7 == 0 && number % 13 == 0) {
                System.out.println("Found a number divisible by both 7 and 13.");
                break;
            }
        } while (true);

        System.out.println("Numbers generated = " + count);
    }
}
