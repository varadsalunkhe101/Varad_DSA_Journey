class TernaryOperator {
    public static void main(String[] args) {
        int a = 8, b = 15;
        int max = (a > b) ? a : b;
        String type = (a % 2 == 0) ? "Even" : "Odd";
        System.out.println(max + " " + type);
    }
}
