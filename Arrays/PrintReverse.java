package Arrays;

public class PrintReverse {
    public static void main(String[] args) {
        int[] arr = { 3, 8, 1, 9, 4 };
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
