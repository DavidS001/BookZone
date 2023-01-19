package dbva.bookzonelocal.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Kosnicka {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "kosnicka_id",nullable = false)
    private Integer id;
    //TODO: Da se dodade klient_id od Klient.
    //TODO: Da se dodade kniga_id od Kniga.
}
