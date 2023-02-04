package dbva.bookzonelocal.repository;

import dbva.bookzonelocal.model.primarykeys.WroteID;
import dbva.bookzonelocal.model.relations.WroteRelation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WroteRepository extends JpaRepository<WroteRelation, WroteID> {
}
