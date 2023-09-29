package com.practice.sample.model.request;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serial;
import java.io.Serializable;

public class FraudCaseCommonRequestDto implements Serializable {
    @Serial
    private static final long serialVersionUID = 6772497651289993981L;

    @JsonProperty("tenantid")
    @JsonAlias({"tenantId","tenantID","TenantId","TenantID","Tenantid","TENANTID"})
    private String tenantId;

    @JsonProperty("appid")
    @JsonAlias({"appId","appID","AppId","AppID","APPID"})
    private String appId;

    @JsonProperty("apptype")
    @JsonAlias({"appType","AppType","APPTYPE"})
    private String appType;

}
