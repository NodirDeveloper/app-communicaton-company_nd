package com.example.appcommunication.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class SImCardAdditionalService {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private Date expireDate;

    @Column(nullable = false)
    private boolean activeStatus;

    @OneToOne(optional = false)
    private SimCard simCard;

    @OneToOne(optional = false)
    private AdditonalService additonalService;


}
