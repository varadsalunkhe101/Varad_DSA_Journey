class FindIndexAndMinMax {
    static int findIndex(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    static int[] minMax(int[] arr) {
        int min = arr[0], max = arr[0];
        for (int x : arr) {
            if (x < min) { min = x; }
            if (x > max) { max = x; }
        }
        return new int[]{min, max};
    }

    public static void main(String[] args) {
        int[] data = {7, 3, 9, 4};
        System.out.println(findIndex(data, 9));
        System.out.println(findIndex(data, 5));
        int[] r = minMax(data);
        System.out.println(r[0] + " " + r[1]);
    }
}
