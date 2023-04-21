package ro.cognizant.coderun2023;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookRepo extends JpaRepository<Book, Long> {

    List<Book> findAll();

}
