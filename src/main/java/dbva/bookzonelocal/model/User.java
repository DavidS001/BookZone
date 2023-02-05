package dbva.bookzonelocal.model;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
@Table(name = "klient", schema = "project")
public class User {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_clen",nullable = false)
    private Integer id;
    @Column(name = "ime",nullable = false)
    private String name;
    @Column(name = "prezime",nullable = false)
    private String surname;
    @Column(name = "telefonski_broj")
    private String telephoneNumber;
    @Column(name = "datum_zaclenuvanje",nullable = false)
    private LocalDate membershipDate;
    @Column(name = "lozinka",nullable = false)
    private String password;

    public User(String name,String surname,String telephoneNumber,LocalDate membershipDate,String password) {
        this.name=name;
        this.surname=surname;
        this.telephoneNumber=telephoneNumber;
        this.membershipDate=membershipDate;
        this.password=password;
    }

    public User() {

    }
    //TODO: da se stave nadvoresen kluc od Tip
}
