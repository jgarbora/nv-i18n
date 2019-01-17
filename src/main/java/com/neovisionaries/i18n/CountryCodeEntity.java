package com.neovisionaries.i18n;

public class CountryCodeEntity {

    public final String name;
    public final String alpha3;
    public final String alpha2;
    public final int numeric;

    public CountryCodeEntity(String name, String alpha2, String alpha3, int numeric) {
        this.name = name;
        this.alpha3 = alpha3;
        this.alpha2 = alpha2;
        this.numeric = numeric;
    }

    @Override
    public String toString() {
        return "CountryCodeEntity{" +
                "name='" + name + '\'' +
                ", alpha3='" + alpha3 + '\'' +
                ", alpha2='" + alpha2 + '\'' +
                ", numeric=" + numeric +
                '}';
    }
}
