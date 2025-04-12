package com.tracking.generator.configuration;

import com.tracking.generator.entity.Country;
import com.tracking.generator.repository.CountryRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Configuration class responsible for adding the application configs and defining needed beans.
 * <p>Using this class to add Country Codes with Country Names to be mapped in the database
 * to ensure some pre-data for testing.
 *
 * @author Snehankita C
 * @version 1.0
 * @since 2025-04-12
 */
@Configuration
public class JPAConfig {
    @Bean
    CommandLineRunner addCountries(CountryRepository repository){
        return args -> {
            if(repository.count() == 0){
                repository.save(new Country("US", "United States"));
                repository.save(new Country("IN", "India"));
                repository.save(new Country("KR", "South Korea"));
                repository.save(new Country("MY", "Malaysia"));
                repository.save(new Country("JP", "Japan"));
                repository.save(new Country("AU", "Australia"));
                repository.save(new Country("BR", "Brazil"));
                repository.save(new Country("FR", "France"));
                repository.save(new Country("CN", "China"));
                repository.save(new Country("CZ", "Czechia"));
            }
        };
    }
}
