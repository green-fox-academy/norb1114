package getIndex;

import java.util.List;

public class GetIndex {
    public static void main(String[] args) {

    }
    public int getIndex (List<String> list, String value){
        for (int i = 0; i < list.size(); i++) {
            if (list.contains(value)){
                return list.indexOf(value);
            }
        }return -1;
    }
}
