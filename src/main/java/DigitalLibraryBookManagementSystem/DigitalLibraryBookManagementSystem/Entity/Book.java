package DigitalLibraryBookManagementSystem.DigitalLibraryBookManagementSystem.Entity;

import jakarta.persistence.*;

@Entity
public class Book {
    @Id
    @Column(name = "bookID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int bookId;

    @Column(name = "Title")
    private String title;

    @Column(name = "author")
    private String author;

    @Column(name = "availabilityStatus")
    private String availabilityStatus; // Available or Checked Out

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
