public class DoubleSidePyramid {

    public static void main(String[] args) {

        int n = 7;

        for (int i = 1; i <= n; i++) {

            // Left Spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Left Stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            // Right Stars
            for (int j = i - 1; j >= 1; j--) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
