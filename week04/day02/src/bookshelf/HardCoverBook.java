package bookshelf;

public class HardCoverBook extends Book {

    public HardCoverBook (String author, int pageNumber) {
        super(author, pageNumber);
        this.pageWeight = 10;
        this.coverWeight = 100;
    }
}