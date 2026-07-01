package main.java.edu.cit.inosanto.springBackend.service;

import main.java.edu.cit.inosanto.springBackend.dto.UserRegisterRequest;
import main.java.edu.cit.inosanto.springBackend.UserRepository;
import main.java.edu.cit.inosanto.springBackend.entities.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public User createUser(UserRegisterRequest user){
        if ((userRepository.existsByEmail(user.getEmail()))){
            throw new IllegalArgumentException("User Already Exists");
        }
            User newUser = new User();
            newUser.setFirstname(user.getFirstname());
            newUser.setLastname(user.getLastname());
            newUser.setMiddlename(user.getMiddlename());
            newUser.setPassword(user.getPassword());

            return userRepository.save(newUser);
    }
}
