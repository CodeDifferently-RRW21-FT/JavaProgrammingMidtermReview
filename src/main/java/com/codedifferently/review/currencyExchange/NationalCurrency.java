package com.codedifferently.review.currencyExchange;

public abstract class NationalCurrency {

    private Long id;
    private String countryName;
    private String currencyName;
    private Double exchangeRate;

    public NationalCurrency(String countryName, String currencyName, Double exchangeRate) {
        this.countryName = countryName;
        this.currencyName = currencyName;
        this.exchangeRate = exchangeRate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getCurrencyName() {
        return currencyName;
    }

    public void setCurrencyName(String currencyName) {
        this.currencyName = currencyName;
    }

    public Double getExchangeRate() {
        return exchangeRate;
    }

    public void setExchangeRate(Double exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    public abstract Double exchange(NationalCurrency otherCurrency, Double amount);

    @Override
    public String toString() {
        return "NationalCurrency{" +
                "id=" + id +
                ", countryName='" + countryName + '\'' +
                ", currencyName='" + currencyName + '\'' +
                ", exchangeRate=" + exchangeRate +
                '}';
    }
}
