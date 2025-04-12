package com.tracking.generator.service;

import com.tracking.generator.entity.Country;
import com.tracking.generator.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class CountryService {
    @Autowired
    CountryRepository countryRepository;
    public CountryService(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }

    public Country saveCountryCode(Country request) {
        return countryRepository.save(request);
    }

    public Country getCountryByCode(String code) {
        System.out.println(countryRepository.findByCode(code));
        return countryRepository.findByCode(code)
                .orElseThrow(() -> new NoSuchElementException("Country code not found: " + code));
    }
}
