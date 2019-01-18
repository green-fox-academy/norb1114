import java.util.Scanner;

public class PrintBigger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the 1st number: ");
        int a = input.nextInt();
        System.out.println("Please enter the 2nd number: ");
        int b = input.nextInt();

        if (a > b) {
            System.out.println("The bigger is " + a);
        } else if (a == b) {
            System.out.println("The 2 numbers are equal");
        } else {
            System.out.println("The bigger is " + b);
        }

        }
    }
