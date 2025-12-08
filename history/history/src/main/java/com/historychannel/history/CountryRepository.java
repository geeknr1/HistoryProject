package com.historychannel.history;

import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;
import java.util.Optional;

@Repository 
public interface CountryRepository extends MongoRepository<Country, String>{
    Optional<Country> findByCountryNameIgnoreCase(String countryName);
    List<Country> findByCountryNameContainingIgnoreCase(String countryName);
    boolean existsByCountryNameIgnoreCase(String countryName);
}