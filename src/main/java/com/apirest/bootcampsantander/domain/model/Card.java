package com.apirest.bootcampsantander.domain.model;

import java.math.BigDecimal;

public class Card {
    private Long id;

    private String number;
    private BigDecimal limit;

    public Card(String number, BigDecimal limit) {
        this.number = number;
        this.limit = limit;
    }

    public Long getId() {
        return id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public BigDecimal getLimit() {
        return limit;
    }

    public void setLimit(BigDecimal limit) {
        this.limit = limit;
    }
}
