class SwitchArrowForm {
    public static void main(String[] args) {
        int day = 3;
        String name = switch (day) {
            case 1 -> "Mon";
            case 2 -> "Tue";
            case 3 -> "Wed";
            default -> "Other";
        };
        System.out.println(name);
    }
}
