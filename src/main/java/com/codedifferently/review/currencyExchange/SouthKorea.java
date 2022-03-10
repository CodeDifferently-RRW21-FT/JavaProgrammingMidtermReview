package com.codedifferently.review.currencyExchange;

public class SouthKorea extends NationalCurrency{
    public SouthKorea(String countryName, String currencyName, Double exchangeRate) {
        super(countryName, currencyName, exchangeRate);
    }

    @Override
    public Double exchange(NationalCurrency otherCurrency, Double amount) {
        return null;
    }
}
