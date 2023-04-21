package ro.cognizant.coderun2023;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import ro.cognizant.coderun2023.BookRepo;

import java.util.List;


@Service
@Slf4j
public class BookImplementation implements BookService{

    private final BookRepo bookRepo;

    private BookImplementation(BookRepo bookRepo){
        this.bookRepo = bookRepo;
    }

    private List<Book> getAllBooks(){
        return bookRepo.findAll();
    }



}