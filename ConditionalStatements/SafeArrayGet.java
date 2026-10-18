class SafeArrayGet {
    static int safeGet(int[] arr, int i) {
        if (i < 0 || i >= arr.length) {
            return -1;
        }
        return arr[i];
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30};
        System.out.println(safeGet(arr, 2));
        System.out.println(safeGet(arr, 7));
    }
}
