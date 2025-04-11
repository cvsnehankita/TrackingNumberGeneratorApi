package com.tracking.generator.configuration;

import com.tracking.generator.entity.Country;
import com.tracking.generator.repository.CountryRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

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
            }
        };
    }
}
