package dbva.bookzonelocal.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Data
@Table(name = "primerok", schema = "project")
public class BookCopy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_primerok",nullable = false)
    private Integer id;
    @Column(name = "sostojba")
    private String state;
    //TODO: napravi nadvoresen kluc ISBN so kniga. ( da se povrze so kngia)
}
