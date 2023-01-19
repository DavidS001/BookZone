package dbva.bookzonelocal.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Data
public class IzdavackaKukja {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "izd_id",nullable = false)
    private Integer id;
    @Column(name = "adresa",length = 50)
    private String address;
    @Column(name = "naziv",nullable = false,length = 50)
    private String name;
}
