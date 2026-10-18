class CountDoublingSteps {
    public static void main(String[] args) {
        int[] sizes = {1000, 1000000};

        for (int n : sizes) {
            int steps = 0;

            for (int i = 1; i <= n; i = i * 2) {
                steps++;
            }

            System.out.println("n = " + n + " -> " + steps + " steps");
        }
    }
}
