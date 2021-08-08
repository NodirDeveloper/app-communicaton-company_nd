package com.example.appcommunication.entity;

import com.example.appcommunication.entity.enums.ExpireType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "users")
public class Tariff {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private Double price;

    @Column(nullable = false)
    private String userType;

    @Column(nullable = false)
    private Double changeTariffPrice;

    @Enumerated(EnumType.STRING)
    private ExpireType expireType;

    @Column(nullable = false)
    private Long freeMb;

    @Column(nullable = false)
    private Long freeInnerMinute;

    @Column(nullable = false)
    private Long freeOuterMinute;

    @Column(nullable = false)
    private int freeSms;

    @Column(nullable = false)
    private Double priceMb;

    @Column(nullable = false)
    private Double priceInnerMinute;

    @Column(nullable = false)
    private Double priceOuterMinute;

    @Column(nullable = false)
    private Double priceSms;




}
