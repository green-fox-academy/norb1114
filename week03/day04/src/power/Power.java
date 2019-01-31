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
        int n = scanner.nextInt();

        System.out.println(power(base,n));

    }
    public static int power(int base, int n){
        if (n == 0) {
            return 1;
        }else {
            return power(base, n - 1) * base;
        }
    }

}
