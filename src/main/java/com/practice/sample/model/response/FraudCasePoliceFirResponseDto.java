package com.practice.sample.model.response;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serial;
import java.io.Serializable;
import java.time.OffsetDateTime;

public class FraudCasePoliceFirResponseDto implements Serializable {

    @Serial
    private static final long serialVersionUID = -8857721878835957818L;
    private OffsetDateTime firDate;
    private Integer firNo;
    private String firDetails;

}
