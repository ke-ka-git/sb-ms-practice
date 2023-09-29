package com.practice.sample.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.OffsetDateTime;

@Entity
@Data
@Table(name="TRANSACTIONS")
public class Transaction {
    @Id
    @GeneratedValue(generator="txn_gen",strategy=GenerationType.AUTO)
    @SequenceGenerator(name="txn_gen",sequenceName="txn_seq",initialValue=1,allocationSize=1)    private Integer txnid;
    @Column
    private String transactionid;
    @Column
    private OffsetDateTime transactiondate;
    @Column
    private BigDecimal transactionamount;
}
