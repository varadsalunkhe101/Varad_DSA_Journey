package Arrays;
import java.util.Arrays;
public class ArraysOfReference {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3 };
        int[] b = a; 
        b[0] = 99;
        System.out.println(a[0]); 
        int[] c = Arrays.copyOf(a, a.length);
        c[1] = 50; System.out.println(a[1] + " " + c[1]);
    }
}
