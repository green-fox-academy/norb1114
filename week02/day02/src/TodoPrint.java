public class TodoPrint {
    public static void main(String... args){
        String todoText = " - Buy milk\n";
        // Add "My todo:" to the beginning of the todoText
        // Add " - Download games" to the end of the todoText
        // Add " - Diablo" to the end of the todoText but with indention

        // Expected outpt:

        // My todo:
        //  - Buy milk
        //  - Download games
        //      - Diablo

        String cover =("My todo:\n");
        String add1 = (" - Download games\n");
        String add2 = ("    - Diablo");

        todoText = cover + todoText + add1 + add2;

        System.out.println(todoText);

        }
}