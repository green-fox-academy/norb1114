import java.util.Scanner;

public class AvarageOfInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter 5 numbers:");
        int a, b, c, d, e;
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        d = input.nextInt();
        e = input.nextInt();

        int sum = a + b + c + d + e;
        double av = (a + b + c + d + e) / 5;

        System.out.println("Sum: " + sum);
        System.out.println("Avarage: " + av);
    }
    }
