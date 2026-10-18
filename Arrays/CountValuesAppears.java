package Arrays;

public class CountValuesAppears {
    public static void main(String[] args) {
        int[] arr = { 2, 5, 2, 8, 2 };
        int x = 2;
        int count = 0;
        for (int v : arr) {
            if (v == x) {
                count++;
            }
        }
        System.out.println(count);
    }
}
