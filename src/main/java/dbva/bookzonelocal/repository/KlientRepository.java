package dbva.bookzonelocal.repository;

import dbva.bookzonelocal.model.Klient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KlientRepository extends JpaRepository<Klient,Integer> {
}
