package com.tracking.generator.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;

@Getter
@Entity
public class Country {
    @Id
    private String code;
    private String countryName;
    public Country(){}

    public Country(String code, String countryName) {
        this.code = code;
        this.countryName = countryName;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }
}
