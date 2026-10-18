package Arrays;

public class SumnAverage {
    public static void main(String[] args) {
        int[] arr = { 4, 7, 1, 9, 3 };
        int sum = 0;
        for (int x : arr) {
            sum = sum + x;
        }
        double avg = (double) sum / arr.length;
        System.out.println("Sum = " + sum);
        System.out.println("Average = " + avg);
    }
}
