package com.example.appcommunication.entity;

import com.example.appcommunication.entity.enums.ExpireType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Paket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private double price;

    @Column(nullable = false)
    private String type;

    @Column(nullable = false)
    private int amount;

    @Column(nullable = false)
    private Long oldRemain;

    @Enumerated(EnumType.STRING)
    private ExpireType expireType;




}
