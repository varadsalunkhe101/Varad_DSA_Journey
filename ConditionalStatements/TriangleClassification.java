class TriangleClassification {
    static String classify(int a, int b, int c) {
        if (a <= 0 || b <= 0 || c <= 0) {
            return "Invalid";
        }
        if ((long) a + b <= c || (long) a + c <= b || (long) b + c <= a) {
            return "Invalid";
        }
        if (a == b && b == c) {
            return "Equilateral";
        }
        if (a == b || b == c || a == c) {
            return "Isosceles";
        }
        return "Scalene";
    }

    public static void main(String[] args) {
        int[][] tests = {{3, 4, 5}, {5, 5, 5}, {5, 5, 8},
                {1, 2, 3}, {0, 4, 4}};
        for (int[] t : tests) {
            String result = classify(t[0], t[1], t[2]);
            System.out.println(t[0] + " " + t[1] + " " + t[2] + " = " + result);
        }
    }
}
