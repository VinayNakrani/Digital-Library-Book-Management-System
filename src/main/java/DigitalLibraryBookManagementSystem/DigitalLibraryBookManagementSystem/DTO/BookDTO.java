package DigitalLibraryBookManagementSystem.DigitalLibraryBookManagementSystem.DTO;

public class BookDTO {

    private int bookId;
    private String title;
    private String author;
    private String availabilityStatus;

    public BookDTO() {
    }

    public BookDTO(int bookId, String title, String author, String availabilityStatus) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.availabilityStatus = availabilityStatus;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAvailabilityStatus() {
        return availabilityStatus;
    }

    public void setAvailabilityStatus(String availabilityStatus) {
        this.availabilityStatus = availabilityStatus;
    }
}
