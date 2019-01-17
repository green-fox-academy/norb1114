public class SecondsInADay {
    public static void main(String[] args) {

        int cHo = 14;
        int cMin = 34;
        int cSec = 42;

        int d = (24 * 60 * 60);
        int c = (cHo * 60 * 60) + (cMin * 60) + cSec;
        int left = d - c;

        System.out.println("there are " + left + " secound left from the day");




    }

}
