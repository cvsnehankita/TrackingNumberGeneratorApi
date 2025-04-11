package com.tracking.generator.repository;

import com.tracking.generator.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
    public interface CountryRepository extends JpaRepository<Country, String> {
}
