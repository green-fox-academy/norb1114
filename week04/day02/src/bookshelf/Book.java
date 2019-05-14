package bookshelf;

public class Book {

    String title;
    String author;
    String releaseYear;
    int pageNumber;
    int weight;
    int pageWeight;
    int coverWeight;

    public Book (String author, int pageNumber) {
        this.author = author;
        this.pageNumber = pageNumber;

    }

    public String showInfo () {
        return author + " " + title + " " + releaseYear;
    }

    public int getWeight () {
        weight = pageNumber * pageWeight + coverWeight;
        return weight;
    }
}