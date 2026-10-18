class GradeWithElseIf {
    public static void main(String[] args) {
        int marks = 72;
        char grade;
        if (marks >= 90) {
            grade = 'A';
        } else if (marks >= 75) {
            grade = 'B';
        } else if (marks >= 60) {
            grade = 'C';
        } else if (marks >= 40) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        System.out.println("Grade " + grade);
    }
}
