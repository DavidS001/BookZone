package dbva.bookzonelocal.repository;

import dbva.bookzonelocal.model.Iznajmuvanje;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IznajmuvanjeRepository extends JpaRepository<Iznajmuvanje,Integer> {
}
