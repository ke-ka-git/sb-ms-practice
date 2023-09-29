package com.practice.sample.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;


@Data
@Entity
@Table (name="FRAUD-CASE")
public class Case {
    @Id
    @GeneratedValue(generator="case_gen",strategy=GenerationType.AUTO)
    @SequenceGenerator(name="case_gen",sequenceName="case_seq",initialValue=1,allocationSize=1)
    private Integer caseid;
    @Column
    private String fraudcasetype;
    @Column
    private String casedetails;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="cardid")
    private Card card;
    @OneToOne (cascade = CascadeType.ALL)
    @JoinColumn(name="firid")
    private FIR firdetails;
    @OneToMany (cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
    @JoinColumn(name="txnid")
    private List<Transaction> transactionList = new ArrayList<>();
}