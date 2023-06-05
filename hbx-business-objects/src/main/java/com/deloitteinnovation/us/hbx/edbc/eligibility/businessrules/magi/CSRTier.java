package com.deloitteinnovation.us.hbx.edbc.eligibility.businessrules.magi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import java.math.BigDecimal;

@XmlAccessorType(XmlAccessType.FIELD)
public class CSRTier {

    private String TierType;

    private String UpperLimitLabel;

    private String LowerLimitLabel;

    public String getLowerLimitLabel() {
        return LowerLimitLabel;
    }

    public void setLowerLimitLabel(String lowerLimitLabel) {
        LowerLimitLabel = lowerLimitLabel;
    }

    public BigDecimal getUpperLimitValue() {
        return UpperLimitValue;
    }

    public void setUpperLimitValue(BigDecimal upperLimitValue) {
        UpperLimitValue = upperLimitValue;
    }

    public BigDecimal getLowerLimitValue() {
        return LowerLimitValue;
    }

    public void setLowerLimitValue(BigDecimal lowerLimitValue) {
        LowerLimitValue = lowerLimitValue;
    }

    private BigDecimal UpperLimitValue;

    private BigDecimal LowerLimitValue;

    private Boolean IsAIAN;

    public String getTierType() {
        return TierType;
    }

    public void setTierType(String tierType) {
        TierType = tierType;
    }

    public Boolean getIsAIAN() {
        return IsAIAN;
    }

    public void setIsAIAN(Boolean isAIAN) {
        IsAIAN = isAIAN;
    }

    public String getUpperLimitLabel() {
        return UpperLimitLabel;
    }

    public void setUpperLimitLabel(String upperLimitLabel) {
        UpperLimitLabel = upperLimitLabel;
    }

}
