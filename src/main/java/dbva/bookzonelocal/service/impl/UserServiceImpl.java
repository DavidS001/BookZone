package dbva.bookzonelocal.service.impl;

import dbva.bookzonelocal.model.Type;
import dbva.bookzonelocal.model.User;
import dbva.bookzonelocal.model.exceptions.InvalidUserIdException;
import dbva.bookzonelocal.repository.TypeRepository;
import dbva.bookzonelocal.repository.UserRepository;
import dbva.bookzonelocal.service.UserService;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class UserServiceImpl implements UserService, UserDetailsService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final TypeRepository typeRepository;

    public UserServiceImpl(UserRepository userRepository, PasswordEncoder passwordEncoder, TypeRepository typeRepository) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
        this.typeRepository = typeRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String name) throws UsernameNotFoundException {
        User user = this.userRepository.findByName(name);
        if(user == null){
            throw new UsernameNotFoundException("Not found");
        }
        return org.springframework.security.core.userdetails.User.builder()
                .username(user.getName())
                .password(user.getPassword())
                .authorities(user.getType().getName())
                .build();
    }

    @Override
    public List<User> findAll() {
        return this.userRepository.findAll();
    }

    @Override
    public User findById(Integer id) {
        User user = this.userRepository.findById(id).orElseThrow(InvalidUserIdException::new);
        return user;
    }

    @Override
    public User create(String name, String password, String surname, String phoneNumber, LocalDate joinedDate,Integer type) {
        String encodedPassword = this.passwordEncoder.encode(password);
        Type userType = this.typeRepository.findById(type).orElseThrow();
        User user = new User(name,surname,phoneNumber,joinedDate,password,userType);
        return this.userRepository.save(user);
    }

    @Override
    public User update(Integer id, String name, String surname, String password, String phoneNumber) {
        String encodedPassword = this.passwordEncoder.encode(password);
        User user = this.userRepository.findById(id).orElseThrow(InvalidUserIdException::new);
        user.setName(name);
        user.setSurname(surname);
        user.setPassword(password);
        user.setTelephoneNumber(phoneNumber);
        return this.userRepository.save(user);
    }


    @Override
    public void delete(Integer id) {
        User user = this.userRepository.findById(id).orElseThrow(InvalidUserIdException::new);
        this.userRepository.delete(user);
    }
}
