package com.nidhallourimi.springbootlibrarystore.model;


import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@Entity(name = "user")//jpa query name
@Table(name = "user")//native querry and the name of table shouldn't be users cuz it's a reserves name on mysql & postgres

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column(name = "username",unique = true,length = 100)
    private String username;

    @Column(name = "name",unique = true,length = 100)
    private String name;

    @Column(name = "password",nullable = false,length = 100)
    private String password;

    @Column(name = "createTime",nullable = false)
    private LocalDateTime createTime;


    //role
    @Enumerated(EnumType.STRING)
    @Column(name ="role", nullable = false)
    private Role role;


}
