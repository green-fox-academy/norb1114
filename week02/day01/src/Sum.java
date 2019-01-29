import java.util.Scanner;

public class Sum {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("type the number: ");
        int number = scanner.nextInt();
        System.out.println(sum(number));

    }

    public static int sum (int maxNumber) {

        int sum = 0;
        for (int i = 0; i <= maxNumber ; i++) {

            sum = sum + i;
        }
        return sum;
    }

}
