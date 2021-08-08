package com.example.appcommunication.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class SimCard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private Long innerMinute;

    @Column(nullable = false)
    private Long outerMinute;

    @Column(nullable = false)
    private Long mb;

    @Column(nullable = false)
    private Long sms;

    @Column(nullable = false)
    private double balance;

    @Column(nullable = false)
    private boolean activeStatus;

    @Column(nullable = false)
    private boolean activatedDate;

    @Column(nullable = false)
    private boolean canDebt;

    @ManyToOne(optional = false)
    private User user;

    @OneToOne(optional = false)
    private Tariff tariff;




}
