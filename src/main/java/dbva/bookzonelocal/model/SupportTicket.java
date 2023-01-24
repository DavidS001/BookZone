package dbva.bookzonelocal.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "support_ticket")
public class SupportTicket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ticket_id",nullable = false)
    private Integer id;
    @Column(name = "poraka",nullable = false,length = 255)
    private String message;
    @Column(name = "tip_ticket",nullable = false,length = 50)
    private String ticketType;
    //TODO: Da se dodade klient_id od Klient.
    //TODO: Da se dodade dostava_id od Dostava.
}
