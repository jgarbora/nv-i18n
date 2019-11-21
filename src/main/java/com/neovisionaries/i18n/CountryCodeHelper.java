package com.neovisionaries.i18n;

import org.apache.commons.lang3.StringUtils;

public class CountryCodeHelper {

    public static boolean areEquals(String code, CountryCode countryCode) {

        if (countryCode == null) {
            return false;
        } else if (countryCode.getAlpha2().equalsIgnoreCase(code) || countryCode.getAlpha3().equalsIgnoreCase(code)) {
            return true;
        } else {
            int numericCode = Integer.parseInt(StringUtils.defaultIfEmpty(StringUtils.getDigits(code), "0"));
            return countryCode.getNumeric() == numericCode;
        }
    }

    public static CountryCode map(String code) throws CountryNotFoundException {
        if (StringUtils.isEmpty(code)) {
            throw new CountryNotFoundException();
        } else {

            CountryCode mapped = CountryCode.getByAlpha2Code(code.toUpperCase());
            if (mapped != null) {
                return mapped;
            }

            mapped = CountryCode.getByAlpha3Code(code.toUpperCase());
            if (mapped != null) {
                return mapped;
            }

            int numericCode = Integer.parseInt(StringUtils.defaultIfEmpty(StringUtils.getDigits(code), "0"));
            mapped = CountryCode.getByCode(numericCode);
            if (mapped != null) {
                return mapped;
            }
            throw new CountryNotFoundException();
        }
    }

    public static CountryCode map(String code, CountryCode defaultValue) {
        if (StringUtils.isEmpty(code)) {
            return defaultValue;
        }
        try {
            return map(code);
        } catch (Exception e) {
            return defaultValue;
        }
    }


}
