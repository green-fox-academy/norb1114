package bookshelf;

public class PaperBackBook extends Book {

    public PaperBackBook (String author, int pageNumber) {
        super(author, pageNumber);
        this.pageWeight = 10;
        this.coverWeight = 20;
    }
}