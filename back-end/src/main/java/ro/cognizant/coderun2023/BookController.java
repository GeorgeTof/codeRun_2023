package ro.cognizant.coderun2023;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController {
    private final BookImplementation bookService;

    public BookController(BookImplementation bookService) {
        this.bookService = bookService;
    }
    
    @PostMapping("/books")
    public ResponseEntity<Book> createBook(@RequestBody Book book){
        Book newBook = bookService.createBook(book);
        return ResponseEntity.status(HttpStatus.CREATED).body(newBook);
    }

    @GetMapping("/books")
    public List<Book> getAllBooks() {
        List<Book> allBooks = bookService.getAllBooks();
        return allBooks;
    }

    
}
