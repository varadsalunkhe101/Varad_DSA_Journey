package BasicPrograms;

public class ReverseString {

    public static String reverse(String str) {
        if (str == null)
            return null;

        char[] array = str.toCharArray();
        int left = 0;
        int right = array.length - 1;

        while (left < right) {
            char temp = array[left];
            array[left] = array[right];
            array[right] = temp;

            left++;
            right--;
        }

        return new String(array);
    }

    public static void main(String[] args) {
        String str = "Varad";
        String str2 = reverse(str);

        System.out.println("Original String: " + str);
        System.out.println("Reversed String: " + str2);

        if (str.equals(str2)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }
}
