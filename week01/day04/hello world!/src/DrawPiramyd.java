public class DrawPiramyd {
    public static void main(String[] args) {

    String star = "*";
    int k = 1;
    int f = 4;

        for (int i = 1; i < 5; i++) {

            for (int t = 0; t < f; t++) {
                System.out.print(" ");
            }

            for (int j = 0; j < k; j++) {
                System.out.print(star);
            }
            k += 2;
            f--;
            System.out.println();
        }

    }
}