class MathMethodsPrimeGcdReversePalindrome {
    static boolean isPrime(int n) {
        if (n < 2) { return false; }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) { return false; }
        }
        return true;
    }

    static int gcd(int a, int b) {
        while (b != 0) {
            int t = b;
            b = a % b;
            a = t;
        }
        return a;
    }

    static int reverse(int n) {
        int rev = 0;
        while (n > 0) {
            rev = rev * 10 + n % 10;
            n = n / 10;
        }
        return rev;
    }

    static boolean isPalindrome(int n) {
        return n == reverse(n);
    }

    public static void main(String[] args) {
        System.out.println(isPrime(29));
        System.out.println(gcd(48, 18));
        System.out.println(reverse(1234));
        System.out.println(isPalindrome(121));
    }
}
