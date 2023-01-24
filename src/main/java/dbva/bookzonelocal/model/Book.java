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
@Table(name = "kniga")
public class Book {

    @Id
    @Column(name = "isbn", nullable = false, length = 17)
    private String id;
    @Column(name = "naslov", nullable = false)
    private String title;
    private Integer rating;
    @Column(name = "dali_se_prodava", nullable = false)
    private Boolean forSale;
    @Column(name = "cena", nullable = false)
    private Integer price;
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
