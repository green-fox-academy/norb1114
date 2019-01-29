public class AppendA {

    public static void main(String[] args) {

        String typo = "Chinchill";

        appendAFunct(typo);
        System.out.println(appendAFunct(typo));


    }

    public static String appendAFunct(String word) {

        String addedA = word + "A";
        return addedA;

    }
}