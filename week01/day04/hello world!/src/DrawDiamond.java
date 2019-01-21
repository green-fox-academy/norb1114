public class DrawDiamond {
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
        int kb = 4;
        int fb = 1;

        for (int ib = 1 ; ib < 5; ib++) {

            for (int tb = 0; tb > fb; tb++) {
                System.out.print(" ");
            }

            for (int jb = 4; jb > kb; jb--){
                System.out.print(star);
            }
            kb -= 2;
            fb--;
            System.out.println();
        }
    }
}





