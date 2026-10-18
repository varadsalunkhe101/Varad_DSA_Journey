import java.util.Arrays;

class DoubleAllArrayElements {
    static void doubleAll(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * 2;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        doubleAll(nums);
        System.out.println(Arrays.toString(nums));
    }
}
