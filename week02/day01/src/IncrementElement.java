public class IncrementElement {

    public static void main(String[] args) {

        int t[] = {1, 2, 3, 4, 5};

        int z = t[3]++;

        t[3] = z;

        System.out.println(t[3]);


    }
}