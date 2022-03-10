package com.codedifferently.review.currencyExchange.cyrpto;

public abstract class CryptoCurrency {
    private Long id;
    private String name;
    private Double currentValue;

    public CryptoCurrency(String name, Double currentValue){
        this.name = name;
        this.currentValue = currentValue;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getCurrentValue() {
        return currentValue;
    }

    public void setCurrentValue(Double currentValue) {
        this.currentValue = currentValue;
    }
}
