package com.tracking.generator.controller;

import com.tracking.generator.entity.Country;
import com.tracking.generator.entity.CountryResponse;
import com.tracking.generator.service.CountryService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * REST controller for managing country codes and names.
 * Provides endpoints to add new countries and retrieve existing ones
 * using their ISO 2-letter uppercase country codes.
 * Base path: {@code /countries}
 * Endpoints:
 * POST //country/add – Add a new country
 * GET //country/get/{code} – Get country details by code</li>
 * Example for request body for add post request:
 * {
 *     "code": "UK",
 *     "countryName": "United Kingdom"
 * }
 *
 * @author Snehankita
 * @version 1.0
 * @since 2025-04-12
 */
@RestController
@RequestMapping("/country")
@Validated
public class CountryController {

    @Autowired
    CountryService countryService;

    @PostMapping("/add")
    public ResponseEntity<Country> addCountryCodes (@Valid @RequestBody Country request){
        Country saved = countryService.saveCountryCode(request);
        return ResponseEntity.status(HttpStatus.CREATED).body(saved);
    }

    @GetMapping("/get/{code}")
    public ResponseEntity<CountryResponse> getCountryDetails (@PathVariable String code){
        Country country = countryService.getCountryByCode(code.toUpperCase());
        return ResponseEntity.ok(new CountryResponse(country.getCode(), country.getCountryName()));
    }
}
