package com.codedifferently.review.currencyExchange;

import com.codedifferently.review.currencyExchange.cyrpto.CryptoCurrency;
import com.codedifferently.review.currencyExchange.cyrpto.ExchangeCrypto;

public class Usa extends NationalCurrency implements ExchangeCrypto {
    public Usa(String countryName, String currencyName, Double exchangeRate) {
        super(countryName, currencyName, exchangeRate);
    }

    @Override
    public Double exchange(NationalCurrency otherCurrency, Double amount) {
        return null;
    }

    @Override
    public Double exchangeCrypto(CryptoCurrency crypto, Double amount) {
        return null;
    }
}
