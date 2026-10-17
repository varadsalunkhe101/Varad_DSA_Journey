package BasicPrograms;

public class PrimeCheck {
    public static void main(String[] args) {
        int num = 1001;
        int i = 2;
        int count = 0;
        if (num == 0) {
            System.out.println("Not Prime this is ZERO");
        }
        if (num == 1) {
            System.out.println("Not Prime this is ONE");
        }
        while (i < num) {
            if (num % i != 0) {
                count++;
            }
            i++;
        }
        if (count != num - 2) {
            System.out.println("Not Prime");
        } else {
            System.out.println("Prime");

        }

    }

}
