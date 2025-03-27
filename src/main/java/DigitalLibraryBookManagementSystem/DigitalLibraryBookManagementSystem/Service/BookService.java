package DigitalLibraryBookManagementSystem.DigitalLibraryBookManagementSystem.Service;

import DigitalLibraryBookManagementSystem.DigitalLibraryBookManagementSystem.DTO.BookDTO;
import DigitalLibraryBookManagementSystem.DigitalLibraryBookManagementSystem.DTO.BookListDTO;
import DigitalLibraryBookManagementSystem.DigitalLibraryBookManagementSystem.DTO.SearchBookDTO;
import DigitalLibraryBookManagementSystem.DigitalLibraryBookManagementSystem.Entity.Book;
import DigitalLibraryBookManagementSystem.DigitalLibraryBookManagementSystem.Repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BookService {

    @Autowired
    BookRepository bookRepository;

    public ResponseEntity<?> addBook(Book book) {
        try {
            bookRepository.save(book);
        } catch (Exception exception) {
            ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Exception : " + exception.getMessage());
        }
        return ResponseEntity.ok("Data Save Successfully");
    }

    public ResponseEntity<BookListDTO> viewAllBook() {
        BookListDTO bookDTO = new BookListDTO();
        try {
            bookDTO.setBookList(bookRepository.findAll());
            bookDTO.setHttpStatus(HttpStatus.OK);
            bookDTO.setMessage("view all Books");
        } catch (Exception exception) {
            ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Exception : " + exception.getMessage());
        }
        return ResponseEntity.ok(bookDTO);
    }

    public ResponseEntity<?> searchBookById(SearchBookDTO searchBookDTO) {
        BookDTO bookDTO = new BookDTO();

        try {
            Optional<Book> optionalBook = bookRepository.findById(searchBookDTO.getBookId());
            if (optionalBook.isEmpty()) {
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Book Number " + searchBookDTO.getBookId() + " Was not Found");
            }

            Book book = optionalBook.get();

            bookDTO.setBookId(book.getBookId());
            bookDTO.setAuthor(book.getAuthor());
            bookDTO.setTitle(book.getTitle());
            bookDTO.setAvailabilityStatus(book.getAvailabilityStatus());
        } catch (Exception exception) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Exception : " + exception.getMessage());
        }
        return ResponseEntity.ok(bookDTO);
    }

    public ResponseEntity<?> updateBookDetails(BookDTO bookDTO) {

        try {
            Optional<Book> optionalBook = bookRepository.findById(bookDTO.getBookId());
            if (optionalBook.isEmpty()) {
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Book Number " + bookDTO.getBookId() + " Was not Found");
            }

            Book book = optionalBook.get();

            book.setAuthor(bookDTO.getAuthor());
            book.setTitle(bookDTO.getTitle());
            book.setAvailabilityStatus(bookDTO.getAvailabilityStatus());

            bookRepository.save(book);

        } catch (Exception exception) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Exception : " + exception.getMessage());
        }
        return ResponseEntity.ok().body("Updated SuccessFully...");
    }

    public ResponseEntity<?> deleteById(SearchBookDTO searchBookDTO) {
        try {
            Optional<Book> optionalBook = bookRepository.findById(searchBookDTO.getBookId());
            if (optionalBook.isEmpty()) {
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Book Number " + searchBookDTO.getBookId() + " Was not Found");
            }

            bookRepository.deleteById(searchBookDTO.getBookId());

        } catch (Exception exception) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Exception : " + exception.getMessage());
        }
        return ResponseEntity.ok("Book No " + searchBookDTO.getBookId() + "Deleted successfully");
    }
}
