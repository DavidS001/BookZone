package dbva.bookzonelocal.repository;

import dbva.bookzonelocal.model.Kategorija;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KategorijaRepository extends JpaRepository<Kategorija,Integer> {
}
