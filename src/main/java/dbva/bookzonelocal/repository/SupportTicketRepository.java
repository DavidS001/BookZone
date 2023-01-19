package dbva.bookzonelocal.repository;

import dbva.bookzonelocal.model.SupportTicket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SupportTicketRepository extends JpaRepository<SupportTicket,Integer> {
}
