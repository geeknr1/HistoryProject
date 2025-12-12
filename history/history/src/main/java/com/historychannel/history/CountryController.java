package com.historychannel.history;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Map;
//import java.util.List.HashMap;

@RestController
@RequestMapping("/api/countries")
@CrossOrigin(origins=("*"))
public class CountryController{
    private final CountryService service;
    @Autowired
    public CountryController(CountryService ser){
        this.service = ser;
    }

    @GetMapping
    public ResponseEntity<List<Country>> getAllCountries(){
        List<Country> country = service.getAllCountries();
        return ResponseEntity.ok(country);
    }

    @GetMapping("/{id}")
    public ResponseEntity <?> getCountryById(@PathVariable String id){
        return service.getCountryById(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/search")
    public ResponseEntity<List<Country>> searchByName(@RequestParam String name){
        return ResponseEntity.ok(service.searchCountriesByName(name));
    }

    @PostMapping
    public ResponseEntity<?> createCountry(@RequestBody Country country_){
        Country created = service.createCountry(country_);
        return ResponseEntity.status(201).body(created);
    }

    @DeleteMapping("/id")
    public ResponseEntity<?> deleteCountry(String id){
        service.deleteCountry(id);
        return ResponseEntity.noContent().build();
    }

}
