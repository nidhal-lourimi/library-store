package com.nidhallourimi.springbootlibrarystore.repository;

import com.nidhallourimi.springbootlibrarystore.model.Role;
import com.nidhallourimi.springbootlibrarystore.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface UserRepository extends JpaRepository<User,Long> {

   Optional<User> findByUsername(String username);

   @Modifying
   @Query("update user u  set u.role =: role where u.username=:username" )
    void updateUserRole(@Param("username") String username, @Param("role") Role role);

}
