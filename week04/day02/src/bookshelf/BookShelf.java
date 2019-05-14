package bookshelf;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class BookShelf {

    List<Book> books;

    public BookShelf () {
        this.books = new ArrayList<>();
    }

    public String getAuthorOfLightest () {

        String autorOfMinWeightBook = "";
        int min = books.get(0).getWeight();
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getWeight() < min){
                min = books.get(i).getWeight();
                autorOfMinWeightBook = books.get(i).author;
            }
        }
        return autorOfMinWeightBook;
    }

    public String getAuthorWithMostPages () {
        String authorOutput = "";
        HashMap<String, Integer> hm = new HashMap<>();
        for (Book book : books) {
            if (!hm.containsKey(book.author)){
                hm.put(book.author, 0);
            }
        }
        for (String authorKey : hm.keySet()) {
            int sumOfPages = 0;
            for (Book book : books ) {
                if (authorKey.equals(book.author) ){
                    sumOfPages += book.pageNumber;
                    hm.replace(book.author, sumOfPages);
                }
            }
        }
        int maxValue = 0;
        for (int value : hm.values()) {
            if (maxValue < value){
                maxValue = value;
            }
        }
        for (String author : hm.keySet()) {
            if (maxValue == hm.get(author)){
                authorOutput = author;
            }
        }
        return authorOutput;
    }
}