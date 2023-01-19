package dbva.bookzonelocal.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Data
public class Bibliotekar {

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
