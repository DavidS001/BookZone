package dbva.bookzonelocal.model;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Data
@Table(name = "kniga", schema = "project")
public class Book {

    @Id
    @Column(name = "isbn", nullable = false, length = 17)
    private String id;
    @Column(name = "naslov", nullable = false)
    private String title;
    @Column(name = "rejting", nullable = true)
    private Integer rating;
    @Column(name = "dali_se_prodava", nullable = false)
    private Boolean forSale;
    @Column(name = "cena", nullable = false)
    private Integer price;

    public Book(String isbn, String title, Integer rating, Boolean forSale, Integer price) {
        this.id = isbn;
        this.title = title;
        this.rating = rating;
        this.forSale = forSale;
        this.price = price;
    }

    public Book() {

    }
    //TODO: Da se dodade izd_id od izdavacka kukja.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Book book = (Book) o;
        return id != null && Objects.equals(id, book.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
