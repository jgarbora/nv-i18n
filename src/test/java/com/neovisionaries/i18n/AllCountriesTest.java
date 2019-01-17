package com.neovisionaries.i18n;

import org.junit.Test;

public class AllCountriesTest {

    @Test
    public void test() {
        for (CountryCodeEntity country: CountryCode.getAllCountries()) {
            System.out.println(country);
        }
    }
}
