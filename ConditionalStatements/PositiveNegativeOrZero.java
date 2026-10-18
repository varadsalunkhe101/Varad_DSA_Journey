class PositiveNegativeOrZero {
    public static void main(String[] args) {
        int[] nums = {5, -8, 0};
        for (int n : nums) {
            if (n > 0) {
                System.out.println(n + " -> Positive");
            } else if (n < 0) {
                System.out.println(n + " -> Negative");
            } else {
                System.out.println(n + " -> Zero");
            }
        }
    }
}
