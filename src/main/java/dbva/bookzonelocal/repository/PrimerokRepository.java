package dbva.bookzonelocal.repository;

import dbva.bookzonelocal.model.Primerok;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrimerokRepository extends JpaRepository<Primerok,Integer> {
}
