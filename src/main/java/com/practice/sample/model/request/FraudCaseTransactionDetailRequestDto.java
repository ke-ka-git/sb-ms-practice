package com.practice.sample.model.request;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.OffsetDateTime;

public class FraudCaseTransactionDetailRequestDto implements Serializable {

    @Serial
    private static final long serialVersionUID = 298574383977678986L;

    @JsonProperty("transactionid")
    @JsonAlias({"transactionId","transactionID","TransactionId","TransactionID","TRANSACTIONID"})
    private String transactionId;

    @JsonProperty("transactiondate")
    @JsonAlias({"transactionDate","TransactionDate","TRANSACTIONDATE"})
    private OffsetDateTime transactionDate;

    @JsonProperty("transactionamount")
    @JsonAlias({"transactionAmount","TransactionAmount","TRANSACTIONAMOUNT"})
    private BigDecimal transactionAmount;
}
