package com.practice.sample.model.response;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.OffsetDateTime;

public class FraudCaseTransactionDetailResponseDto implements Serializable {

    @Serial
    private static final long serialVersionUID = -5540763442035159561L;
    private String transactionId;
    private OffsetDateTime transactionDate;
    private BigDecimal transactionAmount;
}
