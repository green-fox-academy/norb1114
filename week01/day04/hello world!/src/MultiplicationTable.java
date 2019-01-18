import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number:");
        int a = input.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + "*" + a + "=" + (a * i));

        }
    }
}
