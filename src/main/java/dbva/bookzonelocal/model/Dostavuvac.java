package dbva.bookzonelocal.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Data
public class Dostavuvac {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "dos_id",nullable = false)
    private Integer id;
    @Column(name = "ime",nullable = false, length = 50)
    private String name;
    @Column(name = "prezime",nullable = false, length = 50)
    private String surname;
}
