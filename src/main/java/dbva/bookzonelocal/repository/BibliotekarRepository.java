package dbva.bookzonelocal.repository;

import dbva.bookzonelocal.model.Bibliotekar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BibliotekarRepository extends JpaRepository<Bibliotekar,Integer> {
}
