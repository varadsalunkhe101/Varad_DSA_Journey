package BasicPrograms;

public class CheckPallindrome {
    public static void main(String[] args) {

        int num = 12344321;
        int digit;
        int rev = 0;
        int original=num;
        while (num > 0) {
            digit = num % 10;
            rev = rev * 10 + digit;
            num = num / 10;
        }
        System.out.println(rev==original);

    }

}
