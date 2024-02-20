package com.practice.loginpractice.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "users")
public class User {

    @Id
    @Column(nullable = false)
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int user_id;

    @Column
    private String name;

    @Column
    private String email;

    @Column
    private String address;

    @Column
    private String password;


}
