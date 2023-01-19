package dbva.bookzonelocal.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Data
public class Primerok {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_primerok",nullable = false)
    private Integer id;
    @Column(name = "sostojba")
    private String state;
    //TODO: napravi nadvoresen kluc ISBN so kniga. ( da se povrze so kngia)
}
