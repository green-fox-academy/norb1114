import java.util.Scanner;

public class DrawDiamond {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input, then draws a
        // diamond like this:
        //
        //
        //    *
        //   ***
        //  *****
        // *******
        //  *****
        //   ***
        //    *
        //
        // The diamond should have as many lines as the number was

        int numberOfLines = 5;

        for (int i = 1; i <= numberOfLines; i++) {

            for (int j = 0; j < numberOfLines - i; j++) {
                System.out.print(" ");

            }
            for (int j = 0; j < (2*i)-1; j++) {
                System.out.print("*");
            }
            System.out.println();

        }


        for (int x = 0; x <= numberOfLines; x++) {

            for (int j = 0; j < x+1; j++) {
                System.out.print(" ");

            }
            for (int k = 0; k < (2*numberOfLines)-(2*x)-3; k++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }

}


