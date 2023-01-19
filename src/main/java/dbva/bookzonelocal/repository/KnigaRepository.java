package dbva.bookzonelocal.repository;

import dbva.bookzonelocal.model.Kniga;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KnigaRepository extends JpaRepository<Kniga,String> {
}
