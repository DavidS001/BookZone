package dbva.bookzonelocal.repository;

import dbva.bookzonelocal.model.Dostava;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DostavaRepository extends JpaRepository<Dostava,Integer> {
}
