package com.neovisionaries.i18n;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CountryCodeSpanishTest {

    @Test
    public void countyCode2SpanishName() {
        Assert.assertEquals("Italia", CountryCodeSpanish.countyCode2SpanishName(CountryCode.IT));
    }
}