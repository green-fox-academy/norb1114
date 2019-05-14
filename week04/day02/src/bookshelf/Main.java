package bookshelf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        BookShelf shelf = new BookShelf();
        Book book1 = new PaperBackBook("Arany János", 150);
        Book book2 = new PaperBackBook("Arany János", 200);
        Book book3 = new PaperBackBook("Kolcsey Ferenc", 50);
        Book book4 = new PaperBackBook("Ady Endre", 120);
        Book book5 = new PaperBackBook("Ady Endre", 20);
        Book book6 = new HardCoverBook("Mikszáth Kálmán", 11);
        Book book7 = new PaperBackBook("Petőfi Sándor", 210);

        shelf.books.add(book1);
        shelf.books.add(book2);
        shelf.books.add(book3);
        shelf.books.add(book4);
        shelf.books.add(book5);
        shelf.books.add(book6);
        shelf.books.add(book7);


        System.out.println(shelf.getAuthorWithMostPages());
        System.out.println(shelf.getAuthorOfLightest());

        List<Book> bookList = new ArrayList<>();

        bookList.add(book1);
        bookList.add(book2);
        bookList.add(book3);
        bookList.add(book4);
        bookList.add(book5);
        bookList.add(book6);
        bookList.add(book7);

        Collections.sort(bookList, new PageNumberComparator());

        for (Book book : bookList
        ) {
            System.out.println(book.pageNumber);
        }
    }
}