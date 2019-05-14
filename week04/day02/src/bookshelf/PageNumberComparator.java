package bookshelf;

import java.util.Comparator;

public class PageNumberComparator implements Comparator {


    @Override
    public int compare(Object o1, Object o2) {
        Book b1 = (Book) o1;
        Book b2 = (Book) o2;

        if (b1.pageNumber < b2.pageNumber){
            return -1;
        }if (b1.pageNumber > b2.pageNumber){
            return 1;
        }
        return 0;
    }
}