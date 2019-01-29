public class DrawPiramyd {
    public static void main(String[] args) {

    char star = '*';
    int numberOfStars = 1;
    int numberOfSpaces = 4;

        for (int i = 0; i < 4; i++) {

            for (int j = 0; j < numberOfSpaces; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < numberOfStars; j++) {
                System.out.print(star);
            }
            numberOfStars += 2;
            numberOfSpaces--;
            System.out.println();
        }

    }
}