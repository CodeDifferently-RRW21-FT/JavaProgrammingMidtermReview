package com.codedifferently.review.currencyExchange;

import com.codedifferently.review.currencyExchange.fakeDatabase.FakeDatabase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class FakeDatabaseTest {

    private FakeDatabase database;

    @BeforeEach
    public void setup(){
        database = new FakeDatabase();
    }

    @Test
    @DisplayName("Saved New Item")
    public void saveTest01(){
        Usa unitedStated = new Usa("USA", "Dollar", 1.0);
        database.saveCurrency(unitedStated);
        Long expected = 1l;
        Long actual = unitedStated.getId();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Saved and Replace Old Item")
    public void saveTest02(){
        NationalCurrency unitedStated = new Usa("USA", "Dollar", 1.0);
        unitedStated = database.saveCurrency(unitedStated);
        Long id = unitedStated.getId();
        unitedStated.setCountryName("United States");
        database.saveCurrency(unitedStated);

        String expected = "United States";
        String actual = database.getCurrencyById(id).getCountryName();
        Assertions.assertEquals(expected, actual);


    }

}
