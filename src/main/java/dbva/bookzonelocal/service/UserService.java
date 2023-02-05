package dbva.bookzonelocal.service;

import dbva.bookzonelocal.model.Type;
import dbva.bookzonelocal.model.User;

import java.time.LocalDate;
import java.util.List;

public interface UserService {

    List<User> findAll();

    User findById(Integer id);

    User create(String name, String password,String surname, String phoneNumber, LocalDate joinedDate);

    User update(Integer id, String name,String surname, String password, String phoneNumber);

    void delete(Integer id);
}
