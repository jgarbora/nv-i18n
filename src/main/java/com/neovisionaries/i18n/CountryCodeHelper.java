package com.neovisionaries.i18n;

import org.apache.commons.lang3.StringUtils;

public class CountryCodeHelper {

    public boolean areEquals(String code, CountryCode countryCode) {

        if (countryCode == null) {
            return false;
        } else if (countryCode.getAlpha2().equalsIgnoreCase(code) || countryCode.getAlpha3().equalsIgnoreCase(code)) {
            return true;
        } else {
            int numericCode = Integer.parseInt(StringUtils.defaultIfEmpty(StringUtils.getDigits(code), "0"));
            return countryCode.getNumeric() == numericCode;
        }
    }
}
