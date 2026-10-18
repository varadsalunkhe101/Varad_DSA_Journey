class LeapYearCheck {
    public static void main(String[] args) {
        int[] years = {2024, 1900, 2000, 2023};
        for (int year : years) {
            boolean leap = (year % 4 == 0 && year % 100 != 0)
                    || year % 400 == 0;
            System.out.println(year + " -> " + leap);
        }
    }
}
