package com.example.appcommunication.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class PhoneNumber {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String countryCode;

    @Column(nullable = false)
    private String companyCode;

    @Column(nullable = false)
    private String phoneNumber;

    @Column(nullable = false)
    private Double price;

    @ManyToOne(optional = false)
    private Company company;



}
