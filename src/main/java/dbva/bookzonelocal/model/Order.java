package dbva.bookzonelocal.model;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
@Table(name = "naracka", schema = "project")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_naracka",nullable = false)
    private Integer id;
    @Column(name = "datum_naracka",nullable = false)
    private LocalDate orderDate;
    @Column(name = "status",nullable = false,length = 50)
    private String status;
    //TODO: nadvoresen kluc primerok_id od Primerok.
    //TODO: nadvoresen kluc klient_id od Klient.
    //TODO: nadvoresen kluc dostava_id Dostava.
}
