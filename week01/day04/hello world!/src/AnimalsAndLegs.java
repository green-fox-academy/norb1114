import java.util.Scanner;

public class AnimalsAndLegs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number of your chickens: ");
        int chic = input.nextInt();
        int clegs = 2 * chic;
        System.out.println("Please enter the number of your pigs: ");
        int pigs = input.nextInt();
        int plegs = 4 * pigs;
        int allegs = clegs + plegs;
        System.out.println("Your animals have " + allegs + "legs.");
    }

    }
