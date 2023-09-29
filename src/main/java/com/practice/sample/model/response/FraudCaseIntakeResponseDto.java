package com.practice.sample.model.response;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.practice.sample.model.request.FraudCaseCardDetailsRequestDto;
import com.practice.sample.model.request.FraudCaseCommonRequestDto;
import com.practice.sample.model.request.FraudCasePoliceFirRequestDto;
import com.practice.sample.model.request.FraudCaseTransactionDetailRequestDto;
import lombok.Builder;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;

@Setter
@Builder
public class FraudCaseIntakeResponseDto implements Serializable {
    @Serial
    private static final long serialVersionUID = 7522488981004679587L;

    private FraudCaseCommonResponseDto common;
    private long caseId;
    private String fraudCaseType;
    private String caseDetails;
    private FraudCaseCardDetailsResponseDto cardDetails;
    private FraudCasePoliceFirResponseDto policeFIRDetails;
    private FraudCaseTransactionDetailResponseDto[] caseTransactions;
}