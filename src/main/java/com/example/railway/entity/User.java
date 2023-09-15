package com.example.railway.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
@Entity
@Table(name = "users")
public class User {

    @Id
    private Long id;

    @Column
    private String username;

    @Column
    private String email;

    public User() {

    }

}
