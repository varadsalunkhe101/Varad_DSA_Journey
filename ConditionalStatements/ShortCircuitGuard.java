class ShortCircuitGuard {
    public static void main(String[] args) {
        int n = 0;
        if (n != 0 && 100 / n > 5) {
            System.out.println("big");
        } else {
            System.out.println("safe");
        }
    }
}
