package com.nidhallourimi.springbootlibrarystore.service;

import com.nidhallourimi.springbootlibrarystore.model.Role;
import com.nidhallourimi.springbootlibrarystore.model.User;
import com.nidhallourimi.springbootlibrarystore.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.time.LocalDateTime;
import java.util.Optional;

@Service
public class UserService implements IUserService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private PasswordEncoder passwordEncoder;


    public User saveUser(User user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        user.setRole(Role.USER);
        user.setCreateTime(LocalDateTime.now());
        return userRepository.save(user);
    }


    public Optional<User> findByUserName(String username){
        return userRepository.findByUsername(username);
    }

        @Transactional
       public void makeAdmin(String username) {
        userRepository.updateUserRole(username, Role.ADMIN);
    }

}
