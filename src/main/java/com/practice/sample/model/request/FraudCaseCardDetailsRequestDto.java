package com.practice.sample.model.request;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.criteria.CriteriaBuilder;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;

@Data
public class FraudCaseCardDetailsRequestDto implements Serializable {
    @Serial
    private static final long serialVersionUID = 8777498757697930457L;

    @JsonProperty("cardno")
    @JsonAlias({"cardNo","CARDNO","CardNo","CardNo","CardNO","cardNO"})
    private String cardNo;

    @JsonProperty("cardname")
    @JsonAlias({"cardName","CardName","CARDNAME"})
    private String cardName;

    @JsonProperty("cardtype")
    @JsonAlias({"cardType","CardType","CARDTYPE"})
    private String cardType;

    @JsonProperty("cardexp")
    @JsonAlias({"cardExp","CardExp","CARDEXP"})
    private String cardExp;

    @JsonProperty("cardcvv")
    @JsonAlias({"cardCvv","cardCVV","CardCvv","CardCVV","CARDCVV"})
    private Integer cardCvv;

    public FraudCaseCardDetailsRequestDto(String number, String cardKetaki, String credit, String s, int i) {
    }
}
