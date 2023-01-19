package dbva.bookzonelocal.repository;

import dbva.bookzonelocal.model.IzdavackaKukja;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IzdavackaKukjaRepository extends JpaRepository<IzdavackaKukja,Integer> {
}
