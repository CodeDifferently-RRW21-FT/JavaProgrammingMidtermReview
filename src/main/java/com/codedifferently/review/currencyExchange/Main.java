package com.codedifferently.review.currencyExchange;

import com.codedifferently.review.currencyExchange.cyrpto.ExchangeCrypto;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Usa usa = new Usa("United States", "Dollar", 1.0);
        SouthKorea southKorea = new SouthKorea("South Korea", "Won", 0.00081);
        ArrayList<ExchangeCrypto> exchangesWithCrypto = new ArrayList<>();
        ArrayList<NationalCurrency> currencies = new ArrayList<>();
        NFTExchange nftExchange = new NFTExchange();

        exchangesWithCrypto.add(usa);
        exchangesWithCrypto.add(nftExchange);

        currencies.add(usa);
        currencies.add(southKorea);


    }
}
