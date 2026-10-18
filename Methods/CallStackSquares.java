class CallStackSquares {
    static int square(int n) {
        return n * n;
    }

    static int sumOfSquares(int a, int b) {
        return square(a) + square(b);
    }

    public static void main(String[] args) {
        System.out.println(sumOfSquares(3, 4));
    }
}
