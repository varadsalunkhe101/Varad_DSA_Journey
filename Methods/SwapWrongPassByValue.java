class SwapWrongPassByValue {
    static void swapWrong(int a, int b) {
        int t = a;
        a = b;
        b = t;
    }

    public static void main(String[] args) {
        int x = 5, y = 10;
        swapWrong(x, y);
        System.out.println(x + " " + y);
    }
}
