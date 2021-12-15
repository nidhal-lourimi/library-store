package com.nidhallourimi.springbootlibrarystore.service;

import com.nidhallourimi.springbootlibrarystore.model.User;

import javax.transaction.Transactional;
import java.util.Optional;

public interface IUserService {
    User saveUser(User user);

    Optional<User> findByUserName(String username);

    @Transactional
    void makeAdmin(String username);
}
