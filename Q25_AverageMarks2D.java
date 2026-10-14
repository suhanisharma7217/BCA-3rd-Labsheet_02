public class Q25_AverageMarks2D {
    public static void main(String[] args) {
        int[][] marks = {
            {78, 85, 90},
            {66, 72, 80},
            {88, 91, 84}
        };

        int total = 0;
        int count = 0;
        for (int[] student : marks) {
            for (int mark : student) {
                total += mark;
                count++;
            }
        }

        System.out.println("Average of all marks = " + (total / (double) count));
    }
}
