package dbva.bookzonelocal.repository;

import dbva.bookzonelocal.model.Naracka;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NarackaRepository extends JpaRepository<Naracka,Integer> {
}
