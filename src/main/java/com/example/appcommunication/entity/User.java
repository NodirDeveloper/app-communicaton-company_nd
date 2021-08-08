package com.example.appcommunication.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String fullName;

    @Column(nullable = false)
    private String username;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String passportNumber;

    @Column(nullable = false)
    private String clientType;

    @ManyToOne(optional = false)
    private Company company;

    @ManyToOne(optional = false)
    private Role role;

    @ManyToOne(optional = false)
    private Branch branch;


}
