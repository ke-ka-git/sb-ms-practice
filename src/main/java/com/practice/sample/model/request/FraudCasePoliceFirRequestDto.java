package com.practice.sample.model.request;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Getter;

import java.io.Serial;
import java.io.Serializable;
import java.time.OffsetDateTime;
import java.util.Date;
@Getter
@Builder
public class FraudCasePoliceFirRequestDto implements Serializable {
    @Serial
    private static final long serialVersionUID = 5566014683644220657L;

    @JsonProperty("firdate")
    @JsonAlias({"firDate","FirDate","FIRDate","FIRDATE"})
    private OffsetDateTime firDate;

    @JsonProperty("firno")
    @JsonAlias({"firNo","firNO","FirNo","FirNO","FIRNO"})
    private Integer firNo;

    @JsonProperty("firdetails")
    @JsonAlias({"firDetails","FirDetails","FIRDetails","FIRDETAILS"})
    private String firDetails;
}
