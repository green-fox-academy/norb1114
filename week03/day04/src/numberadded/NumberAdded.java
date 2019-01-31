package numberadded;
// Write a recursive function that takes one parameter: n and adds numbers from 1 to n.

public class NumberAdded {

    public static void main(String[] args) {

        System.out.println(numberAddedTo(131));

    }

    public static int numberAddedTo(int n){

        if (n == 1) {
            return 1;
        }else return n + numberAddedTo(n-1);
    }
}
