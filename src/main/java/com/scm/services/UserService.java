package com.scm.services;
import com.scm.entites.User;
import java.util.List;
import java.util.Optional;
public interface UserService {
    User saveUser(User user);
    Optional<User> getUserById(String id);
    Optional<User> updateUser(User user);
    void deleteUser(String id);
    boolean isUserExist(String userId);
    boolean isUserExistByUserName(String email);
    List<User> getAllUsers();
    User getUserByEmail(String email);

    // add more methods here related user service[logic]

}
