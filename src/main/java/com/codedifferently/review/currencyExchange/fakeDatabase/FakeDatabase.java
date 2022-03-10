package com.codedifferently.review.currencyExchange.fakeDatabase;

import com.codedifferently.review.currencyExchange.NationalCurrency;
import com.codedifferently.review.currencyExchange.cyrpto.CryptoCurrency;

import java.util.HashMap;
import java.util.Map;

public class FakeDatabase {

    private Long index = 0l;
    private Map<Long, NationalCurrency> currencies;
    private Map<Long, CryptoCurrency> cryptoCurrencies;

    public FakeDatabase(){
        currencies = new HashMap<>();
        cryptoCurrencies = new HashMap<>();
    }

    public NationalCurrency saveCurrency(NationalCurrency currency){
        if(currency.getId() == null) {
            Long id = ++index;
            currency.setId(id);
            currencies.put(id, currency);
        } else {
            currencies.put(currency.getId(), currency);
        }
        return currency;
    }

    public CryptoCurrency saveCrypto(CryptoCurrency crypto){
        if(crypto.getId() == null){
            Long id = ++index;
            crypto.setId(id);
            cryptoCurrencies.put(id, crypto);
        }else {
            cryptoCurrencies.put(crypto.getId(), crypto);
        }
        return crypto;
    }

    public NationalCurrency getCurrencyById(Long id){
        return currencies.get(id);
    }
}
