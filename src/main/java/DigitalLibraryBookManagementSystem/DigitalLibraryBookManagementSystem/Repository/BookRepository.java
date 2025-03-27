package DigitalLibraryBookManagementSystem.DigitalLibraryBookManagementSystem.Repository;

import DigitalLibraryBookManagementSystem.DigitalLibraryBookManagementSystem.Entity.Book;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {

    @Modifying
    @Transactional
    @Query(value = "DELETE FROM book WHERE bookid = ?", nativeQuery = true)
    void deleteById(int bookID);
}
