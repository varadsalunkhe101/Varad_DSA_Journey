class ScopeDemo {
    static void demo() {
        int a = 10; // Lives until demo() ends.
        for (int i = 0; i < 3; i++) {
            int sq = i * i; // Lives for one pass only.
            System.out.println("i = " + i + ", square = " + sq);
        }
        System.out.println("a = " + a);
        // i and sq are out of scope here.
    }

    public static void main(String[] args) {
        demo();
    }
}
