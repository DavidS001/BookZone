package dbva.bookzonelocal.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
@Table(name = "iznajmuvanje")
public class Rent {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_iznajmuvanje",nullable = false)
    private Integer id;
    @Column(name = "datum_iznajmuvanje",nullable = false)
    private LocalDate rentStartDate;
    @Column(name = "datum_vrakanje",nullable = false)
    private LocalDate rentReturnDate;
    //TODO: Da se dodade bibliotekar_id od bibliotekar.
    //TODO: Da se dodade primerok_id od primerok.
    //TODO: Da se dodade klient_id od klient.
    //TODO: Da se dodade dostava_id od dostava.
}
