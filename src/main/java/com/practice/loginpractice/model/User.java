package com.practice.loginpractice.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "users")
public class User {

    @Id
    @Column(name="user_id", nullable = false)
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int userId;

    @Column
    private String name;

    @Column
    private String email;

    @Column
    private String address;

    @Column
    private String password;


}
