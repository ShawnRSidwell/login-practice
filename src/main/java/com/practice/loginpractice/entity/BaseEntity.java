package com.practice.loginpractice.entity;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import org.hibernate.annotations.CreationTimestamp;

import java.io.Serializable;
import java.time.LocalDateTime;

@MappedSuperclass
public class BaseEntity implements Serializable {

    @CreationTimestamp
    @Column(updatable = false, name = "date_created")
    private LocalDateTime dateCreated;
}
