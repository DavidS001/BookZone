package dbva.bookzonelocal.service;

import dbva.bookzonelocal.model.Type;
import dbva.bookzonelocal.model.User;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.time.LocalDate;
import java.util.List;

public interface UserService extends UserDetailsService {

    List<User> findAll();

    User findById(Integer id);

    User create(String name, String password,String surname, String phoneNumber, LocalDate joinedDate,Integer type);

    User update(Integer id, String name,String surname, String password, String phoneNumber);

    void delete(Integer id);
}
