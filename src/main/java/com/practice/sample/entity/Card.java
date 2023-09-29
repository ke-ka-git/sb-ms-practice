package com.practice.sample.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="CARD")
public class Card {
    @Id
    @GeneratedValue(generator="card_gen",strategy=GenerationType.AUTO)
    @SequenceGenerator(name="card_gen",sequenceName="card_seq",initialValue=1,allocationSize=1)
    private Integer cardid;
    @Column
    private String cardno;
    @Column
    private String cardname;
    @Column
    private String cardtype;
    @Column
    private String cardexp;
    @Column
    private Integer cardcvv;
}