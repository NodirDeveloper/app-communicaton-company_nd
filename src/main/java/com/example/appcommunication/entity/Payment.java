package com.example.appcommunication.entity;

import com.example.appcommunication.entity.enums.PayType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private int amount;

    @Enumerated(EnumType.STRING)
    private PayType payType;

    @ManyToOne(optional = false)
    private SimCard simCard;

}
