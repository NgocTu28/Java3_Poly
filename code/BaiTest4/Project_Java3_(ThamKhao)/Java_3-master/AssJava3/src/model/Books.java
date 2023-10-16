
package model;

public class Books {
    private String bookId;
    private String title;
    private String pubId;
    private String auId;
    private String notes;
    private String username;

    public Books() {
    }

    public Books(String bookId, String title, String pubId, String auId, String notes, String username) {
        this.bookId = bookId;
        this.title = title;
        this.pubId = pubId;
        this.auId = auId;
        this.notes = notes;
        this.username = username;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPubId() {
        return pubId;
    }

    public void setPubId(String pubId) {
        this.pubId = pubId;
    }

    public String getAuId() {
        return auId;
    }

    public void setAuId(String auId) {
        this.auId = auId;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    
}
