package dbva.bookzonelocal.repository;

import dbva.bookzonelocal.model.BookCopy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookCopyRepository extends JpaRepository<BookCopy,Integer> {
}
