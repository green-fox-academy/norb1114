public class cuboid {
    public static void main(String[] args) {

        double l, h, w;
        l = 11;
        h = 55;
        w = 77;

        double A = 2 * ((l * h) + (h * w) + (w * l));
        double V = (l * h * w);

        System.out.println("Surface Area: " + A);
        System.out.println("Volume: " + V);


    }

    }
