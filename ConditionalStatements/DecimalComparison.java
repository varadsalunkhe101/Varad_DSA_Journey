class DecimalComparison {
    public static void main(String[] args) {
        System.out.println(0.1 + 0.2 == 0.3);
        double x = 0.1 + 0.2;
        double y = 0.3;
        System.out.println(Math.abs(x - y) < 1e-9);
    }
}
