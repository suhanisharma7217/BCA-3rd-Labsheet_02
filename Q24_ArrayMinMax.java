public class Q24_ArrayMinMax {
    public static void main(String[] args) {
        int[] numbers = {42, 7, 19, 83, -4, 26};
        int min = numbers[0];
        int max = numbers[0];

        for (int number : numbers) {
            if (number < min) min = number;
            if (number > max) max = number;
        }

        System.out.println("Array: 42, 7, 19, 83, -4, 26");
        System.out.println("Minimum = " + min);
        System.out.println("Maximum = " + max);
    }
}
