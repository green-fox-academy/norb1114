import java.util.Scanner;

public class PartyIndicator2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number of girls: ");
        int a = input.nextInt();
        System.out.println("Please enter the number of boys: ");
        int b = input.nextInt();
        int people = a + b;
        boolean excParty = (a == b) && (people >= 20);

        if (a == 0) {
            System.out.println("Sausage party ");
        } else if (people < 20) {
            System.out.println("Avarage party ");
        } else if (excParty) {
            System.out.println("Excelent party");
        } else System.out.println("Quite cool party");
    }
}
