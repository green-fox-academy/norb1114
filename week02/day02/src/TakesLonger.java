// When saving this quote a disk error has occured. Please fix it.
// Add "always takes longer than" to the StringBuilder (quote) between the words "It" and "you"
// Using pieces of the quote variable (instead of just redefining the string)

public class TakesLonger {
    public static void main(String... args) {
        String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";

        StringBuilder in = new StringBuilder(quote);


        String add = "always takes longer than";

       int insertindex = quote.indexOf(" you");

       in.insert(insertindex, add);

        System.out.println(in);
    }
}