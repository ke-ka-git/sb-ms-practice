package com.practice.sample.model.response;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
public class FraudCaseCardDetailsResponseDto implements Serializable {

    @Serial
    private static final long serialVersionUID = -568615229409716649L;

    private String cardNo;
    private String cardName;
    private String cardType;
    private String cardExp;
    private Integer cardCvv;
}
