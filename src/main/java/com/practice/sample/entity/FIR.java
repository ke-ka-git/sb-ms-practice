package com.practice.sample.entity;

import jakarta.persistence.*;
import lombok.Data;


import java.time.OffsetDateTime;

@Entity
@Data
@Table(name="POLICEFIR")
public class FIR {
    @Id
    @GeneratedValue(generator="fir_gen",strategy=GenerationType.AUTO)
    @SequenceGenerator(name="fir_gen",sequenceName="fir_seq",initialValue=1,allocationSize=1)
    private Integer firid;
    @Column
    private Integer firno;
    @Column
    private OffsetDateTime firdate;
    @Column
    private String firdetails;
}
