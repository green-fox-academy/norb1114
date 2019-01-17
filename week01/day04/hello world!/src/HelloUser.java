import java.util.Scanner;


public class HelloUser {
    public static void main(String[] args) {

        System.out.println("Please enter your name: ");
        Scanner sc = new Scanner(System.in);
        String Name = sc.nextLine();
        System.out.println("Hello " + Name + "!");

    }
}
