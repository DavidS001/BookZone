package dbva.bookzonelocal.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Data
@Table(name = "kategorija")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_kategorija",nullable = false)
    private Integer id;
    @Column(name = "ime_kategorija",nullable = false,length = 50)
    private String categoryName;

}
