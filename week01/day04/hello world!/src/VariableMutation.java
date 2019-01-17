public class VariableMutation {
    public static void main(String[] args) {

        int a = 3;
            a += 10;
        System.out.println(a);

        int b = 100;
            b -= 7;
        System.out.println(b);

        int c = 44;
            c *=2;
        System.out.println(c);

        int d =125;
            d /=5;
        System.out.println(d);

        int  e = 8;
        int cube = e * e * e;
        System.out.println(cube);

        int f1 = 123;
        int f2 = 345;
        boolean ifTrue = f1 > f2;
        System.out.println(ifTrue);

        int g1 = 350;
        int g2 = 200;
        boolean bigger = g1 < 2*g2;
        System.out.println("g2's double is bigger than g1: " + bigger);

        int h = 135798745;
        int fgh = h % 11;
        boolean has = (fgh == 0);
        System.out.println("11 is a divisor of 135798745: " + has);

        int i1 = 10;
        int i2 = 3;
        boolean i2s = i1 > (i2 * i2);
        boolean i2c = i1 < (i2 * i2 * i2);
        System.out.println("i1 is higher than i2's square: " + i2s);
        System.out.println("i1 is higher than i2's square: " + i2c);

        int j = 1521;
        boolean jd3 = ((j % 3) == 0);
        boolean jd5 = ((j % 5) == 0);
        System.out.println("j is dividable by 3: " + jd3);
        System.out.println("j is dividable by 5: " + jd5);

    }
}
