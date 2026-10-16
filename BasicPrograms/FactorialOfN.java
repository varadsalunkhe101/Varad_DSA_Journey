package BasicPrograms;
/**
 * FactorialOfN
 */
public class FactorialOfN {

    static int Factorial(int num) {
        if (num == 0 || num == 1) {
            return 1;
        }
        return num * Factorial(num - 1);
    }

    public static void main(String[] args) {
        int num = 5;
        int fact = Factorial(num);
        System.out.println(fact);
    }
}