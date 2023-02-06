package dbva.bookzonelocal.repository;

import dbva.bookzonelocal.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {

    User findByName(String name);

    User findByNameAndPassword(String name,String password);
}
