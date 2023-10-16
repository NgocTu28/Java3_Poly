package dto;

public class BooksDto {
    private String bookId;
    private String bookTitle;
    private String publishers;
    private String authors;
    private String notes;

    public BooksDto() {
    }

    public BooksDto(String bookId, String bookTitle, String publishers, String authors, String notes) {
        this.bookId = bookId;
        this.bookTitle = bookTitle;
        this.publishers = publishers;
        this.authors = authors;
        this.notes = notes;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getPublishers() {
        return publishers;
    }

    public void setPublishers(String publishers) {
        this.publishers = publishers;
    }

    public String getAuthors() {
        return authors;
    }

    public void setAuthors(String authors) {
        this.authors = authors;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    @Override
    public String toString() {
        return "BooksDto{" + "bookId=" + bookId + ", bookTitle=" + bookTitle + ", publishers=" + publishers + ", authors=" + authors + ", notes=" + notes + '}';
    }
    
    
}
