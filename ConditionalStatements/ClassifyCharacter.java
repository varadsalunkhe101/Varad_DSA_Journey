class ClassifyCharacter {
    public static void main(String[] args) {
        char[] tests = {'e', 'K', '7', '#'};
        for (char c : tests) {
            char lower = Character.toLowerCase(c);
            if (lower == 'a' || lower == 'e' || lower == 'i'
                    || lower == 'o' || lower == 'u') {
                System.out.println(c + " -> vowel");
            } else if (lower >= 'a' && lower <= 'z') {
                System.out.println(c + " -> consonant");
            } else if (c >= '0' && c <= '9') {
                System.out.println(c + " -> digit");
            } else {
                System.out.println(c + " -> other");
            }
        }
    }
}
