class CharacterAndDigitCheck {
    public static void main(String[] args) {
        char c = 'g';
        if (c >= 'a' && c <= 'z') {
            System.out.println("lowercase");
        }
        if (Character.isDigit('7')) {
            System.out.println("digit");
        }
    }
}
