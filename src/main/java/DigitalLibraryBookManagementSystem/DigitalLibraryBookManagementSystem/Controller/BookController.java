package DigitalLibraryBookManagementSystem.DigitalLibraryBookManagementSystem.Controller;

import DigitalLibraryBookManagementSystem.DigitalLibraryBookManagementSystem.DTO.BookDTO;
import DigitalLibraryBookManagementSystem.DigitalLibraryBookManagementSystem.DTO.BookListDTO;
import DigitalLibraryBookManagementSystem.DigitalLibraryBookManagementSystem.DTO.SearchBookDTO;
import DigitalLibraryBookManagementSystem.DigitalLibraryBookManagementSystem.Entity.Book;
import DigitalLibraryBookManagementSystem.DigitalLibraryBookManagementSystem.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    BookService bookService;

    @PostMapping("addBook")
    public ResponseEntity<?> addBook(@RequestBody Book book) {
        return bookService.addBook(book);
    }

    @GetMapping("viewAllBook")
    public ResponseEntity<BookListDTO> viewAllBook() {
        return bookService.viewAllBook();
    }

    @GetMapping("searchBook")
    public ResponseEntity<?> searchBookById(@RequestBody SearchBookDTO searchBookDTO) {
        return bookService.searchBookById(searchBookDTO);
    }

    @PutMapping("updateBook")
    public ResponseEntity<?> updateBookDetails(@RequestBody BookDTO bookDTO) {
        return bookService.updateBookDetails(bookDTO);
    }

    @DeleteMapping("DeleteById")
    public ResponseEntity<?> deleteById(@RequestBody SearchBookDTO searchBookDTO) {
        return bookService.deleteById(searchBookDTO);
    }
}
