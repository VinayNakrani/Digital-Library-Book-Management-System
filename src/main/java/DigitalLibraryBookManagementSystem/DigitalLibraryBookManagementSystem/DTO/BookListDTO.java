package DigitalLibraryBookManagementSystem.DigitalLibraryBookManagementSystem.DTO;

import DigitalLibraryBookManagementSystem.DigitalLibraryBookManagementSystem.Entity.Book;
import org.springframework.http.HttpStatus;

import java.util.List;

public class BookListDTO {
    HttpStatus httpStatus;
   String message;
    List<Book> bookList;

    public BookListDTO() {
    }

    public BookListDTO(HttpStatus httpStatus, String message, List<Book> bookList) {
        this.httpStatus = httpStatus;
        this.message = message;
        this.bookList = bookList;
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }

    public void setHttpStatus(HttpStatus httpStatus) {
        this.httpStatus = httpStatus;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<Book> getBookList() {
        return bookList;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }
}