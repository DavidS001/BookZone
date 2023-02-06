package dbva.bookzonelocal.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Table(name = "tip",schema = "project")
public class Type {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tip_id", nullable = false)
    private Integer id;
    @Column(name = "tip_ime", nullable = false)
    private String name;
    @OneToMany(mappedBy = "type")
    private List<User> users;
}
