import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int a = input.nextInt();
        int b= (a % 2);
        if (b == 0) {
            System.out.println("Your number is even");
        }
        else {
            System.out.println("Your number is odd");
        }
    }
}
