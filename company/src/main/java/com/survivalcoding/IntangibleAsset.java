package com.survivalcoding;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;

public abstract class IntangibleAsset extends Asset {
    // name, date
    private String intangibleAssetType;
    private LocalDate acquiredDate;

    public IntangibleAsset(String name, String intangibleAssetType, LocalDate acquiredDate) {
        super(name);
        setIntangibleAssetType(intangibleAssetType);
        setAcquiredDate(acquiredDate);
    }

    public IntangibleAsset(String name, String intangibleAssetType, String acquiredDate) {
        super(name);
        setIntangibleAssetType(intangibleAssetType);
        setAcquiredDate(acquiredDate);
    }

    public String getIntangibleAssetType() {
        return intangibleAssetType;
    }

    public void setIntangibleAssetType(String intangibleAssetType) {
        if (intangibleAssetType == null) {
            throw new IllegalArgumentException("자산 종류가 비어있습니다.");
        }
        this.intangibleAssetType = intangibleAssetType;
    }

    public LocalDate getAcquiredDate() {
        return acquiredDate;
    }

    private void setAcquiredDate(LocalDate acquiredDate) {
        if (acquiredDate == null) {
            throw new IllegalArgumentException("취득일을 작성해야합니다.");
        }
        try {
            this.acquiredDate = acquiredDate;
        } catch (DateTimeParseException e) {
            throw new IllegalArgumentException("취득일 작성 형식이 틀립니다.");
        }
    }

    private void setAcquiredDate(String acquiredDate) {
        if (acquiredDate == null) {
            throw new IllegalArgumentException("취득일을 작성해야합니다.");
        }
        try {
            this.acquiredDate = LocalDate.parse(acquiredDate);
        } catch (DateTimeParseException e) {
            throw new IllegalArgumentException("취득일 작성 형식이 틀립니다.");
        }
    }
}
