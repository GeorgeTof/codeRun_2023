package ro.cognizant.coderun2023;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.boot.autoconfigure.web.WebProperties;

@Entity
@Data
@NoArgsConstructor      //?
@AllArgsConstructor     //?
public class Book {
    @Id
    @Column(updatable = false, nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Getter
    private Long Id;
    @Getter
    @Setter
    private String BookName;
    @Getter
    @Setter
    private String Publisher;
}
