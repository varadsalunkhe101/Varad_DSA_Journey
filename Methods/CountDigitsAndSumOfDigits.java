class CountDigitsAndSumOfDigits {
    static int countDigits(int n) {
        if (n == 0) { return 1; }
        int count = 0;
        while (n > 0) {
            count++;
            n = n / 10;
        }
        return count;
    }

    static int sumOfDigits(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n = n / 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        int n = 4592;
        int digits = countDigits(n);
        int sum = sumOfDigits(n);
        System.out.println("Digits: " + digits + ", Sum: " + sum);
    }
}
