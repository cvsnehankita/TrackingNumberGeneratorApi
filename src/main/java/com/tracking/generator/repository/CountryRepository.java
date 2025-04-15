package com.tracking.generator.repository;

import com.tracking.generator.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
    public interface CountryRepository extends JpaRepository<Country, String> {
    Optional<Country> findByCode(String code);
}
