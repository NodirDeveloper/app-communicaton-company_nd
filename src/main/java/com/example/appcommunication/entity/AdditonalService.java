package com.example.appcommunication.entity;

import com.example.appcommunication.entity.enums.AdditionalServiceType;
import com.example.appcommunication.entity.enums.ExpireType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class AdditonalService {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private double price;

    @Enumerated(EnumType.STRING)
    private ExpireType expireType;

    @Enumerated(EnumType.STRING)
    private AdditionalServiceType additionalServiceType;


}
