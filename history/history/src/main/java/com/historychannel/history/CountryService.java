package com.historychannel.history;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CountryService{
    private final CountryRepository repository;
    @Autowired
    public CountryService(CountryRepository rep){
        this.repository = rep;
    }

    public List<Country> getAllCountries(){
        return this.repository.findAll();
    }

    public Optional<Country> getCountryById(String id){
        return this.repository.findById(id);
    }

    public List<Country> searchCountriesByName(String name){
        return repository.findByCountryNameContainingIgnoreCase(name);
    }

    public Country createCountry(Country country){
        if(repository.existsByCountryNameIgnoreCase(country.getCountryName())){
            throw new IllegalArgumentException("country already added");
        }
        return repository.save(country);
    }

    public void deleteCountry(String id){
        if(! repository.existsById(id)){
            throw new IllegalArgumentException("there's no country to delete");
        }
        else{
            repository.deleteById(id);
        }
    }

    public boolean existsbyID(String id){
        return repository.existsById(id);
    }

    public long getCount(){
        return repository.count();
    }
}