package Arrays;
public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = { 7, 3, 9, 4 };
        int key = 9;
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                index = i;
                break;
            }
        }
        System.out.println(index);
    }
}
