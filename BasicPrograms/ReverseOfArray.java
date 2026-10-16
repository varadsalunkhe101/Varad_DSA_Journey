
package BasicPrograms;

public class ReverseOfArray {
    public static void main(String[] args) {

        int arr[] = { 1, 2, 3, 4, 5 };
        int n = arr.length;

        int arr1[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr1[i] = arr[n - 1 - i];
        }

        for (int j = 0; j < n; j++) {
            System.out.print(arr1[j] + " ");
        }
    }
}
