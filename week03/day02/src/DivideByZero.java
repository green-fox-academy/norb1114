import java.util.Scanner;

public class DivideByZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int divider = scanner.nextInt();

        try {
            int result = 10 / divider;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.err.println("FaiL");
        }
    }
}