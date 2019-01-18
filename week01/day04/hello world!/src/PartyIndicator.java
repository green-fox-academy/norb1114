import java.util.Scanner;

public class PartyIndicator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number of girls: ");
        int a = input.nextInt();
        System.out.println("Please enter the number of boys: ");
        int b = input.nextInt();
        int ratio = a % b;
        int ppl = a + b;
        boolean exc = (ratio == 0) && (ppl >= 20);
        boolean qcool = (ratio < 0) && (ppl >= 20);

        if (a == 0) {
            System.out.println("Sausage party ");
        } else if (ppl < 20) {
            System.out.println("Avarage party ");
        } else if (qcool) {
            System.out.println("quite cool party");
        } else if (exc) {
            System.out.println("Excelent party");
        }
        }
    }
