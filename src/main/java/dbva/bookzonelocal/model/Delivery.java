package dbva.bookzonelocal.model;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
@Table(name = "dostava", schema = "project")
public class Delivery {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_dostava",nullable = false)
    private Integer id;
    @Column(name = "datum_dostava",nullable = false)
    private LocalDate shippingDate;
    @Column(name = "adresa",nullable = false, length = 50)
    private String address;
    @Column(name = "status",nullable = false, length = 50)
    private String status;
    //TODO: da se stave dostavuvac_id od Dostavuvac.
}
