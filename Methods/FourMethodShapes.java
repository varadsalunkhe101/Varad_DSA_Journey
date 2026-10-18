class FourMethodShapes {
    static void greet() {
        System.out.println("Hello!");
    }

    static void printStars(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    static int add(int a, int b) {
        return a + b;
    }

    static boolean isEven(int n) {
        return n % 2 == 0;
    }

    public static void main(String[] args) {
        greet();
        printStars(4);
        System.out.println(add(3, 4));
        System.out.println(isEven(10));
    }
}
