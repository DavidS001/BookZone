package dbva.bookzonelocal.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Data
public class Kategorija {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_kategorija",nullable = false)
    private Integer id;
    @Column(name = "ime_kategorija",nullable = false,length = 50)
    private String categoryName;

}
