package dbva.bookzonelocal.repository;

import dbva.bookzonelocal.model.Kosnicka;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KosnickaRepository extends JpaRepository<Kosnicka,Integer> {
}
