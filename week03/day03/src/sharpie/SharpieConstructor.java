package sharpie;

public class SharpieConstructor {
    public static void main(String[] args) {

        Sharpie rt = new Sharpie("green", 3.46);
        rt.use();

        System.out.println(rt.inkAmount);

    }

}

