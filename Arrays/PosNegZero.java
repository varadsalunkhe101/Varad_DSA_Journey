package Arrays;

public class PosNegZero {
    public static void main(String[] args) {
        int[] arr = { 5, -3, 0, 8, -1, 4 };
        int pos = 0, neg = 0, zero = 0;
        for (int x : arr) {
            if (x > 0) {
                pos++;
            } else if (x < 0) {
                neg++;
            } else {
                zero++;
            }
        }
        System.out.println("Positive: " + pos);
        System.out.println("Negative: " + neg);
        System.out.println("Zero: " + zero);
    }
}
