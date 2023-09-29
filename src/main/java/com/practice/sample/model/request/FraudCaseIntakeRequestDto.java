package com.practice.sample.model.request;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Builder;
import java.io.Serial;
import java.io.Serializable;
@Getter
@Builder
@JsonIgnoreProperties(ignoreUnknown = true) //to ignore any unknown field
public class FraudCaseIntakeRequestDto implements Serializable {

    @Serial
    private static final long serialVersionUID = 8954529235541711614L;
    @JsonProperty("common")
    @JsonAlias({"COMMON","Common"})
    private FraudCaseCommonRequestDto common;

    @JsonProperty("caseid")
    @JsonAlias({"CASEID","CASEid","CASEId","CaseID","CaseId","caseID","caseId"})
    private Integer caseId;

    @JsonProperty("fraudcasetype")
    @JsonAlias({"fraudCaseType","FraudCaseType","FRAUDCASETYPE"})
    private String fraudCaseType;

    @JsonProperty("casedetails")
    @JsonAlias({"caseDetails","CaseDetails","CASEDETAILS"})
    private String caseDetails;

    @JsonProperty("carddetails")
    @JsonAlias({"cardDetails","CardDetails","CARDDETAILS"})
    private FraudCaseCardDetailsRequestDto cardDetails;

    @JsonProperty("policefirdetails")
    @JsonAlias({"policeFIRDetails","PoliceFIRDetails","POLICEFIRDETAILS"})
    private FraudCasePoliceFirRequestDto policeFIRDetails;

    @JsonProperty("casetransactions")
    @JsonAlias({"caseTransactions","CaseTransactions","CASETRANSACTIONS"})
    private FraudCaseTransactionDetailRequestDto[] caseTransactions;
}
