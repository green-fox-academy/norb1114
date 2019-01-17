import java.util.Scanner;

public class MileToKmConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the distance in km: ");
        int km = input.nextInt();
        double mf = km * 1.609344;
        System.out.println("The distance you entered in miles: " + mf);

    }
}
