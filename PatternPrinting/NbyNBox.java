package PatternPrinting;

/**
 * NbyNBox
 */
public class NbyNBox {
    static int n = 5;

    public static void main(String[] args) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }

    }
}