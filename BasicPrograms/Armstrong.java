package BasicPrograms;

public class Armstrong {
    public static void main(String[] args) {
        double digit = 0;
        int num = 153;
        int num1 = num;
        int tempog = num;
        int og = num;
        int base;
        int exponent = 0;

        while (num1 > 0) {
            num1 = num1 / 10;
            exponent++;
        }
        while (tempog > 0) {
            base = tempog % 10;
            tempog = tempog / 10;
            digit = Math.pow(base, exponent) + digit;
        }

        if (og == digit) {
            System.out.println("The Number is Armstrong Number");
        } else {
            System.out.println("The Number is Not a Armstrong Number");

        }

    }
}
