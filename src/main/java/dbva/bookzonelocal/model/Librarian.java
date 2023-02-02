package dbva.bookzonelocal.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Data
@Table(name = "bibliotekar", schema = "project")
public class Librarian {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_bibliotekar",nullable = false)
    private Integer id;
    @Column(name = "ime",nullable = false, length = 50)
    private String name;
    @Column(name = "prezime",nullable = false, length = 50)
    private String surname;
    @Column(name = "lozinka",nullable = false, length = 20)
    private String password;
}
