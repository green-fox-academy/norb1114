package bunies2;

public class Bunny2 {
    public static void main(String[] args) {

        System.out.println(bunny2ears(3));
    }
        public static int bunny2ears(int bunnies){
            if(bunnies <= 0){
                return 0;
            }else if (bunnies % 2 != 0) {
                return bunny2ears(bunnies - 1) + 2;
            }else {
                return  bunny2ears(bunnies - 1) + 3;
        }
    }

}

