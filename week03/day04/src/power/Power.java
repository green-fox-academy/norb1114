package power;

// Given base and n that are both 1 or more, compute recursively (no loops)
// the value of base to the n power, so powerN(3, 2) is 9 (3 squared).

import java.util.Scanner;

public class Power {

    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);
        System.out.println("give the base number: ");
        int base = scanner.nextInt();
        System.out.println("give the power number");
        int power = scanner.nextInt();

        System.out.println(powerN(base,power));

    }
    public static int powerN(int base, int power){
        if (power == 0) {
            return 1;
        }else {
            return powerN(base, power - 1) * base;
        }
    }

}
