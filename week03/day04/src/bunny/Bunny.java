package bunny;

public class Bunny {
    public static void main(String[] args) {

        System.out.println(bunnyears(11));
    }
    public static int bunnyears(int bunnies){
        if(bunnies <= 0){
            return 0;
        }else {
            return bunnyears(bunnies - 1) + 2;
        }
    }
}
