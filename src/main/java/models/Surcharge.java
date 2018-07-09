package models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Surcharge
{
    @JsonProperty("surc_name")
    private String surchargeName;

    @JsonProperty("surc_qty")
    private String surchargeQuantity;

    public String getSurchargeName()
    {
        return surchargeName;
    }

    public void setSurchargeName(String surchargeName)
    {
        this.surchargeName = surchargeName;
    }

    public String getSurchargeQuantity()
    {
        return surchargeQuantity;
    }

    public void setSurchargeQuantity(String surchargeQuantity)
    {
        this.surchargeQuantity = surchargeQuantity;
    }

    @Override
    public String toString()
    {
        return "Surcharge{" +
                "surchargeName='" + surchargeName + '\'' +
                ", surchargeQuantity='" + surchargeQuantity + '\'' +
                '}';
    }
}
