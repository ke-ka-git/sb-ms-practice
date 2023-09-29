package com.practice.sample.model.response;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serial;
import java.io.Serializable;

public class FraudCaseCommonResponseDto implements Serializable {

    @Serial
    private static final long serialVersionUID = 5263879784607319839L;
    private String tenantId;
    private String appId;
    private String appType;

}
